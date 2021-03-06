package com.linkedbear.demo.service;

import com.linkedbear.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Lazy
public class DemoService {
    
    public DemoService() {
        System.out.println("DemoService constructor run ......");
    }
    
    @Autowired
    DemoDao demoDao;
    
    @Transactional(rollbackFor = Exception.class)
    public void doTransaction() {
        demoDao.save("aaaaaaaa");
        int i = 1 / 0;
        demoDao.update("18", "ccc");
    }
}
