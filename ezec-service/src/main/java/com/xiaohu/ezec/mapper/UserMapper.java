package com.xiaohu.ezec.mapper;

import org.springframework.stereotype.Repository;

import com.xiaohu.ezec.model.User;

@Repository
public interface UserMapper {

    int addUser(User user);
}
