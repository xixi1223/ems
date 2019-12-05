package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by XIXI on 2019/10/25.
 */
public interface UserDao {
    //登录
    User queryByUsernameAndPassword(
            @Param("username") String username,
            @Param("password") String password);

    //注册
    void regist(User user);
}
