package com.nopainanymore.springbootmybatisplus.dto;

import com.nopainanymore.springbootmybatisplus.entity.User;
import com.nopainanymore.springbootmybatisplus.util.dtoconvert.DTOConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

/**
 * @author nopainanymore
 * @time 2019-04-08 23:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInputDTO {

    private String name;

    private Integer age;

    public User convertToUser() {
        UserInputDTOConvert userInputDTOConvert = new UserInputDTOConvert();
        return userInputDTOConvert.convert(this);
    }

    public UserInputDTO convertFor(User user) {
        UserInputDTOConvert userInputDTOConvert = new UserInputDTOConvert();
        return userInputDTOConvert.reverse(user);
    }

    private static class UserInputDTOConvert implements DTOConverter<UserInputDTO, User> {
        @Override
        public User convert(UserInputDTO userInputDTO) {
            User user = new User();
            BeanUtils.copyProperties(userInputDTO, user);
            return user;
        }

        @Override
        public UserInputDTO reverse(User user) {
            UserInputDTO userDTO = new UserInputDTO();
            BeanUtils.copyProperties(user, userDTO);
            return userDTO;
        }
    }

}
