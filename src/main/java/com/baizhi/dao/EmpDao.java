package com.baizhi.dao;

import com.baizhi.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by XIXI on 2019/10/25.
 */
public interface EmpDao {
    //查询所有员工
    List<Emp> queryAll();
    //根据id查询员工
    Emp queryById(Integer id);
    //删除员工
    void deleteById(Integer id);
    //添加员工
    void insertEmp(
            @Param("name") String name,
            @Param("salary") Double salary,
            @Param("age") Integer age);
    //更新员工
    void updatetEmp(
            @Param("id") Integer id,
            @Param("name") String name,
            @Param("salary") Double salary,
            @Param("age") Integer age);
}
