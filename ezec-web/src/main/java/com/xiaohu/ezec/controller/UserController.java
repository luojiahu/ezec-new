package com.xiaohu.ezec.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiaohu.ezec.model.ReturnMessage;
import com.xiaohu.ezec.model.User;
import com.xiaohu.ezec.service.IUserManager;
import com.xiaohu.ezec.utils.ControllerUtil;

@Controller
public class UserController {
    
    @Autowired
    IUserManager userManager;
    
    @RequestMapping(method=RequestMethod.POST, path="user/add")
    @ResponseBody
    public ReturnMessage addUser(HttpServletRequest request, HttpServletResponse response,
           @RequestBody User user) throws Exception {
        
        if( null == user) {
            return ControllerUtil.failReturnMessage("null user");
        }
        
        if(userManager.addUser(user)<0) {
            return ControllerUtil.failReturnMessage("fail to add uer");
        }
        return ControllerUtil.successReturnMessage("success"); 
    }

}
