package com.lw.dao;

import com.lw.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 56321 on 2018/7/4.
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    public User getUserById(@Param("id") int id);
}
