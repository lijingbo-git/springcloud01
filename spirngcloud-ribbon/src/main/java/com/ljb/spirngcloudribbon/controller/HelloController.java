package com.ljb.spirngcloudribbon.controller;

import com.ljb.spirngcloudribbon.service.Helloservie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Helloservie helloservie;

    @GetMapping("/hi")
    public String hi(String name){
        return helloservie.hiService(name);
    }
}
