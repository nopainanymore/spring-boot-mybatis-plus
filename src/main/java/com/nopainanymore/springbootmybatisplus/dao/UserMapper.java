package com.nopainanymore.springbootmybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nopainanymore.springbootmybatisplus.entity.User;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author nopainanymore
 * @time 2019-03-29 17:29
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> listAllUser();

}
