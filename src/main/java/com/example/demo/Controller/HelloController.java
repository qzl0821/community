package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //允许这个类接受前端请求
public class HelloController {

    @GetMapping("/hello")  // 此注解使http对/hello的请求能映射到hello()方法里
    public String hello(@RequestParam(name = "name", defaultValue = "world") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
