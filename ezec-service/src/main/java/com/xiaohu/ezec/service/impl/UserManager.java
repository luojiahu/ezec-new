package com.xiaohu.ezec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xiaohu.ezec.mapper.UserMapper;
import com.xiaohu.ezec.model.User;
import com.xiaohu.ezec.service.IUserManager;

@Service
public class UserManager implements IUserManager{

    @Autowired
    UserMapper userMapper;
    
    @Transactional(propagation=Propagation.REQUIRED, readOnly=false/*, rollbackFor=Exception.class*/)
    public int addUser(User user) throws Exception {
        User innerUser = new User();
        innerUser.setName("innerUser");
        userMapper.addUser(innerUser);
        userMapper.addUser(user);
        
        throw new Exception("In addUser!!");
    }

}
