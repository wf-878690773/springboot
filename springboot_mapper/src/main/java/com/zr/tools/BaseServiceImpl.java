package com.zr.tools;

import com.zr.tools.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

@Service
public class BaseServiceImpl<T> implements BaseService<T> {


    private Mapper<T> mapper;


    @Override
    public List<T> list(T entity) {
        return mapper.select(entity);
    }

    @Override
    public T get(T entity) {
        return  mapper.selectOne(entity);
    }

    @Override
    public int update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int save(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int delete(T entity) {
        return mapper.deleteByPrimaryKey(entity);
    }
}
