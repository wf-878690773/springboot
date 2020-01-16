package com.zr.tools;

import java.util.List;

public interface BaseService<T> {


     List<T> list(T entity);


     T get(T entity);



     int update(T entity);


    int save(T entity);



     int delete(T entity);

}
