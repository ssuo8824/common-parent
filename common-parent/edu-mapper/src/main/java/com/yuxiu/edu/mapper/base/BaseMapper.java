package com.yuxiu.edu.mapper.base;

public interface BaseMapper<T> {
    public T findById(Integer id);
    public  T findByUUID(String uuid);
    public void deleteById(Integer id);

}
