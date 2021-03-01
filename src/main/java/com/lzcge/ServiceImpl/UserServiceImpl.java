package com.lzcge.ServiceImpl;


import com.lzcge.Entity.User;
import com.lzcge.Mapper.UserMapper;
import com.lzcge.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> Select() {
        return userMapper.SelectUser();
    }

    @Override
    public void Insert(User user) {
        User user1 = new User();
        user1.setUserId(user.getUserId());
        user1.setUserName(user.getUserName());
        user1.setUserPassword(user.getUserPassword());
        userMapper.insert(user1);
    }
}
