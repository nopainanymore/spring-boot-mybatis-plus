package com.nopainanymore.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author nopainanymore
 * @time 2019-03-29 17:22
 */
@Data
public class User {

    @TableId
    private String userId;

    private String name;

    private Integer age;


}
