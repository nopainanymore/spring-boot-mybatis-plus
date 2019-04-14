package com.nopainanymore.springbootmybatisplus.util.dtoconvert;

import com.nopainanymore.springbootmybatisplus.dto.UserDTO;
import com.nopainanymore.springbootmybatisplus.entity.User;
import org.springframework.beans.BeanUtils;

/**
 * @author nopainanymore
 * @time 2019-04-08 23:12
 */
public class UserDTOConverter implements DTOConverter<UserDTO, User> {

    @Override
    public User convert(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

    @Override
    public UserDTO reverse(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }
}
