package com.example.yanyue.controller;

import com.example.yanyue.pojo.Message;
import com.example.yanyue.pojo.common.Result;
import com.example.yanyue.pojo.vo.MessageVO;
import com.example.yanyue.service.MessageService;
import com.github.pagehelper.PageInfo;
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

    /**
     * @Author yanyue
     * 获取所有的留言信息
     * 路径： /message/getAll
     * @Param  page 当前页
     * @Param limit 页面大小
     * @Param messageVO 留言对象，json数据对象，查询所有时不用传参
     * @return com.example.yanyue.pojo.common.Result<java.util.List < com.example.yanyue.pojo.vo.MessageVO>> 留言视图的结果封装处理对象，json数据
     **/
    @RequestMapping("/getAll")
    @ResponseBody
    @CrossOrigin
    public Result<List<MessageVO>> getAll(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                          @RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize, @RequestBody MessageVO messageVO) {
        List<MessageVO> messageVOS = messageService.getAll(currentPage, pageSize, messageVO);


        if (messageVOS == null || messageVOS.size() == 0) {
            messageVOS = new ArrayList<>();
        }
        Result<List<MessageVO>> result = Result.success(messageVOS);
        PageInfo<MessageVO> pageInfo = new PageInfo<>(messageVOS);
        result.setCount(pageInfo.getTotal());
        System.out.println(result);
        return result;
    }

    /**
     * @Author yanyue
     * 新增留言信息
     * 路径： /message/insert
     * @Param message 留言对象，json对象
     * @return int 新增留言的操作结果，<=0为失败
     **/
    @ResponseBody
    @RequestMapping("/insert")
    @CrossOrigin
    public int insert(@RequestBody Message message){
        if(message==null||message.getAccountId()==null||message.getAccountId()==0){
            return -1;
        }else{
            return messageService.insert(message);
        }
    }
}
