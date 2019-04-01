package com.nopainanymore.springbootmybatisplus.service;

import com.nopainanymore.springbootmybatisplus.entity.User;

import java.util.List;

/**
 * @author nopainanymore
 * @time 2019-03-29 18:36
 */
public interface UserService {

    User getUserById(String userId);

    List<User> listAllUser();
}
