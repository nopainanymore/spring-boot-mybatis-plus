package com.nopainanymore.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author nopainanymore
 * @time 2019-04-01 22:23
 */
@Data
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String uuid;


}
