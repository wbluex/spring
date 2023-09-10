package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author whgstart
 * @create 2023-09-05 13:46
 */

@Controller
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody

    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name ==> " + name);
        System.out.println("普通参数传递 age ==> " + age);


        return "{'moudle':'param'}";
    }
}
