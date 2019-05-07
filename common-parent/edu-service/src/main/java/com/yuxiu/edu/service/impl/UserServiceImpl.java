package com.yuxiu.edu.service.impl;

import com.yuxiu.edu.pojo.User;
import com.yuxiu.edu.service.UserService;
import com.yuxiu.edu.service.base.BaseServiceimpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceimpl<User> implements UserService{
    @Override
    public User Login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return this.UserMapper.findById(id);
    }
}
