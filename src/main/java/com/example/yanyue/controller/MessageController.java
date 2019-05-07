package com.example.yanyue.controller;

import com.example.yanyue.pojo.Message;
import com.example.yanyue.pojo.common.Result;
import com.example.yanyue.pojo.vo.MessageVO;
import com.example.yanyue.service.MessageService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public Result<List<MessageVO>> getAll(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                          @RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize, @RequestBody MessageVO messageVO) {
        List<MessageVO> messageVOS = messageService.getAll(currentPage, pageSize, messageVO);
        System.out.println("currentPage==>"+currentPage);
        System.out.println("pageSize==>"+pageSize);
        System.out.println("messageVO==>"+messageVO);

        if (messageVOS == null || messageVOS.size() == 0) {
            messageVOS = new ArrayList<>();
        }
        Result<List<MessageVO>> result = Result.success(messageVOS);
        PageInfo<MessageVO> pageInfo = new PageInfo<>();
        result.setCount(pageInfo.getTotal());
        System.out.println(result);
        return result;
    }

    @ResponseBody
    @RequestMapping("/insert")
    @CrossOrigin
    public int insert(Message message){
        if(message==null||message.getAccountId()==null||message.getAccountId()==0){
            return -1;
        }else{
            return messageService.insert(message);
        }
    }
}
