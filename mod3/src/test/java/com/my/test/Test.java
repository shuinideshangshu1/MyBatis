package com.my.test;

import com.my.mybatis.mapper.CacheMapper;
import com.my.mybatis.pojo.Emp;
import com.my.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession1 = build.openSession(true);
        SqlSession sqlSession2 = build.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp empByEid1 = mapper1.getEmpByEid(1);
        sqlSession1.close();
        Emp empByEid2 = mapper2.getEmpByEid(1);
        System.out.println(empByEid1);
        System.out.println(empByEid2);
        sqlSession2.close();
    }
}
