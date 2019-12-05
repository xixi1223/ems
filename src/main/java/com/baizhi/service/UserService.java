package com.baizhi.service;

import com.baizhi.entity.User;

/**
 * Created by XIXI on 2019/10/25.
 */
public interface UserService {
    //登录
    User find(String username, String password);
    //注册
    void add(User user);
}
