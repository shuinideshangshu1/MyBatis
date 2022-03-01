package com.my.mybatis.mapper;

import com.my.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    User getUserById(@Param("id") Integer id);
    List<User> getAllUser();
    Integer getCount();
    @MapKey("id")
    Map<String,Object> getUserByIdToMap();
    List<User> getUserByLike(@Param("username") String username);
    int deleteMore(@Param("ids") String ids);
}
