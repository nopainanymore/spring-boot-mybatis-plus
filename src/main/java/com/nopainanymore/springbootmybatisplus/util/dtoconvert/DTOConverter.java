package com.nopainanymore.springbootmybatisplus.util.dtoconvert;

/**
 * @author nopainanymore
 * @time 2019-04-08 23:08
 */
public interface DTOConverter<S, T> {

    T convert(S s);

    S reverse(T t);
}
