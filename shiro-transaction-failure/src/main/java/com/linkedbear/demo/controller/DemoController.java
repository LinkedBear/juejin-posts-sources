package com.linkedbear.demo.controller;

import com.linkedbear.demo.service.DemoService;
import com.linkedbear.demo.service.DemoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @Autowired
//    @Lazy
    DemoService demoService;
    
    @Autowired
    DemoService2 demoService2;
    
    @GetMapping("/doTransaction")
    public String doTransaction() {
        demoService.doTransaction();
        return "doTransaction";
    }
    
    @GetMapping("/doTransaction2")
    public String doTransaction2() {
        demoService2.doTransaction();
        return "doTransaction2";
    }
}
