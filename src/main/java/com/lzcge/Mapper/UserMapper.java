package com.lzcge.Mapper;

import com.lzcge.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //插入user数据
    public void insert(User user);

    // 获取所有user数据
    public List<User> SelectUser();
}
