package com.linkedbear.demo.mapper;

import com.linkedbear.demo.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DepartmentMapper {
    
    Department findById(String id);
    
}
