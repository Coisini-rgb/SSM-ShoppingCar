package com.lzcge.Service;

import com.lzcge.Entity.User;

import java.util.List;

public interface UserService {

    public List<User> Select();

    public void Insert(User user);
}
