package com.linkedbear.demo.controller;

import com.linkedbear.demo.entity.Department;
import com.linkedbear.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DepartmentController {
    
    @Autowired
    DepartmentService departmentService;
    
    @GetMapping("/department/{id}")
    public Department findById(@PathVariable("id") String id) {
        Department department = new Department();
        department.setId(id);
        department.setName(UUID.randomUUID().toString().replaceAll("-", ""));
        return departmentService.update(department);
    }
    
}
