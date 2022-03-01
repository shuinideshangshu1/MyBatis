package com.my.mybatis;

import com.github.pagehelper.PageHelper;
import com.my.mybatis.mapper.EmpMapper;
import com.my.mybatis.pojo.Emp;
import com.my.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1,5);
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(emp -> System.out.println(emp));
    }
}
