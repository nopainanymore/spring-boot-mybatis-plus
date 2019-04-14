package com.nopainanymore.springbootmybatisplus.dto;


import com.nopainanymore.springbootmybatisplus.entity.User;
import com.nopainanymore.springbootmybatisplus.util.dtoconvert.DTOConverter;
import com.nopainanymore.springbootmybatisplus.util.dtoconvert.UserDTOConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author nopainanymore
 * @time 2019-04-08 22:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserDTO {

    private String name;

    private Integer age;

    public User convertToUser() {
        UserDTOConverter userDTOConverter = new UserDTOConverter();
        return userDTOConverter.doForward(this);
    }

    public UserDTO convertFor(User user) {
        UserDTOConverter userDTOConverter = new UserDTOConverter();
        return userDTOConverter.doBackward(user);
    }

    private static class UserDTOConvert extends DTOConverter<UserDTO, User> {
        @Override
        public User doForward(UserDTO userDTO) {
            return null;
        }

        @Override
        public UserDTO doBackward(User user) {
            return null;
        }
    }


}
