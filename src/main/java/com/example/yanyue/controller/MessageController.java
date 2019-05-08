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
     * @Description 获取所有的留言信息
     * @url /message/getAll
     * @Param [currentPage, pageSize, messageVO] int 当前页，int 页面大小，messageVO 留言对象
     * @return com.example.yanyue.pojo.common.Result<java.util.List < com.example.yanyue.pojo.vo.MessageVO>> 留言视图的结果封装处理对象，json数据 可以不用参数传递
     **/
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

    /**
     * @Author yanyue
     * @Description 新增留言信息
     * @url /message/insert
     * @Param [message] 留言对象 json对象
     * @return int 新增留言的操作结果 <=0为失败
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
