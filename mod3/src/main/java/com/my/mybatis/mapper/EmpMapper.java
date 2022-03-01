package com.my.mybatis.mapper;

import com.my.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    List<Emp> getAllEmp();
    Emp getEmpAndDept(@Param("eid") Integer eid);
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);
    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
