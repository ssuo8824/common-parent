package com.yuxiu.edu.service;


import com.yuxiu.edu.pojo.User;
import com.yuxiu.edu.service.base.BaseService;

public interface UserService extends BaseService<User>{


    /**
     * 自有的业务逻辑方法
     * @param username
     * @param password
     * @return
     */
    public User Login(String username, String password);
}
