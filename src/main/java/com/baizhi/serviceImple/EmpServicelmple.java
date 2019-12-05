package com.baizhi.serviceImple;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by XIXI on 2019/10/25.
 */
@Service
@Transactional
public class EmpServicelmple implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> findAll() {
        return empDao.queryAll();
    }

    @Override
    public Emp findById(Integer id) {
        return empDao.queryById(id);
    }

    @Override
    public void updateEmp(String name, Double salary, Integer age, Integer id) {
        empDao.updatetEmp(id,name,salary,age);
    }

    @Override
    public void deleteById(Integer id) {
        empDao.deleteById(id);
    }

    @Override
    public void addEmp(String name, Double salary, Integer age) {
        empDao.insertEmp(name,salary,age);
    }
}
