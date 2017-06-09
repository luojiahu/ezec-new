package com.xiaohu.ezec.model.vo;

import java.io.Serializable;

public class UserVo implements Serializable {

    private static final long serialVersionUID = 5640896213299126538L;

    private String name;
    
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
