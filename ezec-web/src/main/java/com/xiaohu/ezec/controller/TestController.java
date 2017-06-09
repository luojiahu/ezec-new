package com.xiaohu.ezec.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaohu.ezec.model.TestModel;
import com.xiaohu.ezec.service.TestService;

/**
 * Created by luojiahu on 2017/4/29.
 */

@Controller
public class TestController {
    
    @Autowired
    TestService testService;
    
    @RequestMapping(method=RequestMethod.POST, path="test")
    @ResponseBody
    public TestModel testShow(HttpServletRequest request, HttpServletResponse response,
           @RequestBody TestModel test) {
        
        TestModel tm = new TestModel();
        tm.setId(test.getId());
        tm.setName(test.getName());
        return tm;
    }
    
}
