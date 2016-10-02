package com.springboot.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Bhargav on 10/2/2016.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello!!";
    }

}
