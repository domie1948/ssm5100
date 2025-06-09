package com.project.demo.controller;

import com.project.demo.entity.MessageFeedback;
import com.project.demo.service.MessageFeedbackService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 留言反馈：(MessageFeedback)表控制层
 *
 */
@RestController
@RequestMapping("/message_feedback")
public class MessageFeedbackController extends BaseController<MessageFeedback, MessageFeedbackService> {

    /**
     * 留言反馈对象
     */
    @Autowired
    public MessageFeedbackController(MessageFeedbackService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
