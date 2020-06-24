package com.linkedbear.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class DemoDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public List<Map<String, Object>> findAll() {
        return jdbcTemplate.query("select * from sys_department", new ColumnMapRowMapper());
    }
    
    public int save(String name) {
        return jdbcTemplate.update("insert into sys_department (id, name) values (?, ?)",
                UUID.randomUUID().toString().replaceAll("-", ""), name);
    }
    
    public int update(String id, String name) {
        return jdbcTemplate.update("update sys_department set name = ? where id = ?", name, id);
    }
}
