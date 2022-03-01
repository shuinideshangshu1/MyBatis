package com.my.mybatis.mapper;

import com.my.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp getEmpByEid(@Param("eid") Integer eid);
    void insertEmp(Emp emp);
}
