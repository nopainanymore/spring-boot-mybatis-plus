package com.nopainanymore.springbootmybatisplus.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nopainanymore.springbootmybatisplus.entity.User;

import java.util.List;

/**
 * @author nopainanymore
 * @time 2019-03-29 17:29
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> listAllUser();

}
