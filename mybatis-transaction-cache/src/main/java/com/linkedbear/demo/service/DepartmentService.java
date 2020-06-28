package com.linkedbear.demo.service;

import com.linkedbear.demo.entity.Department;
import com.linkedbear.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService {
    
    @Autowired
    DepartmentMapper departmentMapper;
    
    @Transactional(rollbackFor = Exception.class)
    public Department update(Department department) {
        Department temp = departmentMapper.findById(department.getId());
        temp.setName(department.getName());
        Department temp2 = departmentMapper.findById(department.getId());
        System.out.println(temp == temp2);
        return temp;
    }
    
}
