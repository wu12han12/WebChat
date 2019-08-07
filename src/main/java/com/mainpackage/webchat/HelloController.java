package com.mainpackage.webchat;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// 项目搭建参考：https://www.jianshu.com/p/d6b7a2806655
@RestController
public class HelloController
{
    @RequestMapping("hello")
    public String hello()
    {
        return  "Hello,World!" ;
    }
}

