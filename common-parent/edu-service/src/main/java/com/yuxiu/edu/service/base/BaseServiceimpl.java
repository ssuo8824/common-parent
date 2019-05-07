package com.yuxiu.edu.service.base;

import com.yuxiu.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceimpl<T> implements BaseService<T> {

    @Autowired
    protected UserMapper UserMapper;
}
