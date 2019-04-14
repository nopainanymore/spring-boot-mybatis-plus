package com.nopainanymore.springbootmybatisplus.controller;

import com.google.gson.Gson;
import com.nopainanymore.springbootmybatisplus.dto.UserDTO;
import com.nopainanymore.springbootmybatisplus.entity.User;
import com.nopainanymore.springbootmybatisplus.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nopainanymore
 * @time 2019-03-29 18:54
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private static final Gson gson = new Gson();


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getById")
    public String getById(@RequestParam String id) {
        User user = userService.getUserById(id);
        return gson.toJson(user);
    }

    @GetMapping("/list")
    public String listAllUser() {
        List<User> userList = userService.listAllUser();
        return gson.toJson(userList);
    }


//    public User addUser(UserDTO userDTO) {
//        User user = userDTO.convertToUser();
//        return userService.add(user);
//    }

    private User convertFor(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

}
