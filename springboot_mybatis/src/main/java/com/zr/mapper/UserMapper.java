package com.zr.mapper;

import com.zr.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import javax.crypto.BadPaddingException;
import java.util.List;

/**
 * 注解版
 */
@Mapper

public interface UserMapper {

    //映射注解
    @Results({
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "username", column = "USERNAME"),
            @Result(property = "password", column = "PASSWORD"),
    })
    @Select("select * from t_user")
    List<User> list();

    @Select("select * from t_user where username like #{username}")
    List<User> findByUsername(String username);

    @Select("select * from t_user where userId like #{userId}")
    User getOne(String userId);


    @Delete("delete from t_user where userId = #{userId}")
    int delete(String userId);

    @Insert("insert into t_user values (#{useId},#{username},#{password})")
    int add(User user);

    @Update("update t_user set username=#{username},password=#{password} where userId=#{userId} ")
    int update(User user);
}
