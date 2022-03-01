package com.my.mybatis.mapper;

import com.my.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();
    void updateUser();
    void deleteUser();
    User getUserById();
    List<User> getAllUser();
}
