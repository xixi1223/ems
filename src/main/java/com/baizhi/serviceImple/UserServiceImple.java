package com.baizhi.serviceImple;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by XIXI on 2019/10/25.
 */
@Service
@Transactional
public class UserServiceImple implements UserService {
    @Autowired
    private UserDao userDao;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User find(String username, String password) {
        return userDao.queryByUsernameAndPassword(username,password);
    }

    @Override
    public void add(User user) {
        userDao.regist(user);
    }
}
