package com.group.controller;

import com.group.mapper.TestMapper;
import com.group.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestMapper testMapper;
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/test")
    public String loginGet(Model model) {
        return "login";
    }

    @RequestMapping(value = "/test/user")
    public String index(Model model) {
        List<Test> t= testMapper.selectUsers();
        System.out.println(t.get(0).getPassword());
        model.addAttribute("s",t);
        return  "demo";
    }

    @GetMapping("/t")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/getTest")
    @ResponseBody
    public List<Test> getUsers(){

        return testMapper.selectUsers();
    }

}