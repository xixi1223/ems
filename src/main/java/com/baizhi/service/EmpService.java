package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

/**
 * Created by XIXI on 2019/10/25.
 */
public interface EmpService {
    //查询所有员工
    List<Emp> findAll();
    //根据id查询员工
    Emp findById(Integer id);
    void updateEmp(String name,Double salary,Integer age,Integer id);
    //删除员工
    void deleteById(Integer id);
    //添加
    void addEmp(String name, Double salary, Integer age);
}

