package com.nopainanymore.springbootmybatisplus.service.impl;

import com.nopainanymore.springbootmybatisplus.common.UserMapper;
import com.nopainanymore.springbootmybatisplus.entity.User;
import com.nopainanymore.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nopainanymore
 * @time 2019-03-29 18:36
 */
@Service
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(String userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public List<User> listAllUser() {
        return userMapper.listAllUser();
    }

}
