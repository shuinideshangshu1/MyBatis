package com.my.mybatis.mapper;

import com.my.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();
    User getUserByUsername(String admin);
    User checkLogin(String username,String password);
    User checkLoginByMap(Map<String,Object> map);
    int insertUser(User user);
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}
