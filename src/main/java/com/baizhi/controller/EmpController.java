package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by XIXI on 2019/10/25.
 */
@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    private List<Emp> emp;
    private Emp e;

    public Emp getE() {
        return e;
    }

    public void setE(Emp e) {
        this.e = e;
    }

    public EmpService getEmpService() {
        return empService;
    }

    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    @RequestMapping("emplist")
    public String queryAll(HttpServletRequest request){
        emp=empService.findAll();
        request.setAttribute("emp",emp);
        return "emplist";
    }

    @RequestMapping("delete")
    public String delete(Integer id,HttpServletRequest request){
        empService.deleteById(id);
        emp=empService.findAll();
        request.setAttribute("emp",emp);
        return "emplist";
    }
    @RequestMapping("update")
    public String update(Integer id,HttpServletRequest request){
        e=empService.findById(id);
        request.setAttribute("e",e);
        return "updateEmp";
    }
    @RequestMapping("upda")
    public String upda(Integer id,String name,Double salary,Integer age,HttpServletRequest request){
        empService.updateEmp(name,salary,age,id);
        emp=empService.findAll();
        request.setAttribute("emp",emp);
        return "emplist";
    }
    @RequestMapping("add")
    public String add(String name,Double salary,Integer age,HttpServletRequest request){
        empService.addEmp(name,salary,age);
        emp=empService.findAll();
        request.setAttribute("emp",emp);
        return "emplist";
    }
}
