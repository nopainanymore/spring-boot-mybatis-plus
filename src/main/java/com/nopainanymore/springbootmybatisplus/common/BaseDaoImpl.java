package com.nopainanymore.springbootmybatisplus.common;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.nopainanymore.springbootmybatisplus.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author nopainanymore
 * @time 2019-04-01 21:53
 */
public abstract class BaseDaoImpl<E extends BaseEntity> implements BaseDao<E> {

    @Autowired
    private BaseMapper<E> baseMapper;

    @Override
    public int insert(E entity) {
        return baseMapper.insert(entity);
    }

    @Override
    public int deleteById(Serializable id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return 0;
    }

    @Override
    public int delete(Wrapper<E> wrapper) {
        return 0;
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return baseMapper.deleteBatchIds(idList);
    }

    @Override
    public int updateById(E entity) {
        return baseMapper.updateById(entity);
    }

    @Override
    public int update(E entity, Wrapper<E> updateWrapper) {
        return baseMapper.update(entity, updateWrapper);
    }

    @Override
    public Optional<E> selectById(String id) {
        return Optional.ofNullable(baseMapper.selectById(id));
    }

    @Override
    public List<E> selectBatchIds(Collection<? extends Serializable> idList) {
        return baseMapper.selectBatchIds(idList);
    }

    @Override
    public List<E> selectByMap(Map<String, Object> columnMap) {
        return baseMapper.selectByMap(columnMap);
    }

    @Override
    public Optional<E> selectOne(Wrapper<E> queryWrapper) {
        return Optional.ofNullable(baseMapper.selectOne(queryWrapper));
    }

    @Override
    public Integer selectCount(Wrapper<E> queryWrapper) {
        return baseMapper.selectCount(queryWrapper);
    }

    @Override
    public List<E> selectList(Wrapper<E> queryWrapper) {
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<E> queryWrapper) {
        return baseMapper.selectMaps(queryWrapper);
    }

    @Override
    public List<Object> selectObjectList(Wrapper<E> queryWrapper) {
        return baseMapper.selectObjs(queryWrapper);
    }

    @Override
    public IPage<E> selectPage(IPage<E> page, Wrapper<E> queryWrapper) {
        return baseMapper.selectPage(page, queryWrapper);
    }

    @Override
    public IPage<Map<String, Object>> selectMapsPage(IPage<E> page, Wrapper<E> queryWrapper) {
        return baseMapper.selectMapsPage(page, queryWrapper);
    }
}
