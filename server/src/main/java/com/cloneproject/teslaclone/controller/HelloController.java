package com.cloneproject.teslaclone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class HelloController {

    @GetMapping("/rest")
    public @ResponseBody Map<String, Object> helloRest(){
        System.out.println("HelloController 호출");
        Map<String, Object> map = new HashMap<>();
        map.put("name", "bong");
        map.put("age", 23);
        return map;
    }
}
