package com.group.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import com.group.model.Echars;
@Controller
public class EchartController {
    @RequestMapping(value = "/")
    public String index(Model model){
        Echars e=new Echars("aewq",123);
        List<Echars> list = new ArrayList<Echars>();
        list.add(new Echars("帽子",50));
        list.add(new Echars("鞋子",126));
        list.add(new Echars("毛衣",75));
        list.add(new Echars("羽绒服",201));
        list.add(new Echars("羊毛衫",172));
        String skirt="裙子";
        int nums=30;
        ArrayList<String> li=new ArrayList<String>();
        li.add("Spark SQL实战");
        li.add("Hadoop基础");
        li.add("Storm实战");
        li.add("Spark Streaming实战");
        li.add("理论");

        model.addAttribute("list",li);
        model.addAttribute("k",skirt);
        model.addAttribute("nums",nums);
        model.addAttribute("s",list);
        return "demo";
    }




    @RequestMapping(value="/hello",method = RequestMethod.GET)
        public String sayHello(){

            return "Hello Spring Boot!";

        }

        @RequestMapping(value="/first",method = RequestMethod.GET)
        public ModelAndView firstDemo(){

            return new ModelAndView("test");//跟templates文件夹下的test.html名字一样，返回这个界面

        }

        @RequestMapping(value="/courseClickCount",method = RequestMethod.GET)
        public ModelAndView courseClickCountStat(){

            return new ModelAndView("demo");//跟templates文件夹下的demo.html名字一样，返回这个界面

        }
    @RequestMapping(value = "/EcharsShow")
    @ResponseBody
    public List<Echars> findById(Model model) {
        List<Echars> list = new ArrayList<Echars>();
        list.add(new Echars("帽子",50));
        list.add(new Echars("鞋子",126));
        list.add(new Echars("毛衣",75));
        list.add(new Echars("羽绒服",201));
        list.add(new Echars("羊毛衫",172));
        System.err.println(list.toString());

        return list;
    }

    @GetMapping(value = "/Echars.do")
    public String echarts4(Model model){
        System.err.println("========开始");
        return "test";
    }
    @RequestMapping(value = "/h")
    public String hello(Model model) {
        Echars p=new Echars("aa",12);
        model.addAttribute("person", p);
        return "hello";
    }

    }


