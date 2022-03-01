package com.my.mybatis.test;

import com.my.mybatis.mapper.ParameterMapper;
import com.my.mybatis.mapper.SelectMapper;
import com.my.mybatis.pojo.User;
import com.my.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.insertUser(new User(null,"wangwu","123",23,"男","123@163.com"));
    }
}
