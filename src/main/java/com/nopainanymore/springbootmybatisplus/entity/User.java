package com.nopainanymore.springbootmybatisplus.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author nopainanymore
 * @time 2019-03-29 17:22
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private String name;

    private Integer age;


}


