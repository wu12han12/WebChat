package com.mainpackage.webchat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// 项目搭建参考：https://www.jianshu.com/p/d6b7a2806655

//@RestController为@ResponseBody和@Controller的结合
@Controller
public class HelloController
{
    //value为url后缀  method为http请求方法，默认为get
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello()
    {
        return  "indexs";
    }
}


