package com.lzcge.Controller;

import com.lzcge.Entity.User;
import com.lzcge.ServiceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @ResponseBody
    @RequestMapping(value = "/Insert",method = RequestMethod.GET)
    public void InsertUser(){
        User user = new User();
        user.setUserId(1);
        user.setUserName("wangqingxiong");
        user.setUserPassword("1234");
        System.out.println(user);
        userService.Insert(user);
    }

    @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public List<User> SelectUser(){
        List<User> select = userService.Select();
        System.out.println(select);
        return select;
    }




}
