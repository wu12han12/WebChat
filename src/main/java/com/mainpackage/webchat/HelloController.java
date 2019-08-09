package com.mainpackage.webchat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestParam;

// 项目搭建参考：https://www.jianshu.com/p/d6b7a2806655

//@RestController为@ResponseBody和@Controller的结合
//@Controller 能够实现返回html页面
@RestController
public class HelloController
{
    //value为url后缀  method为http请求方法，默认为get
    @RequestMapping(value="/login",method = RequestMethod.GET)
    //name 为get请求的请求名，需要与参数名相一致。
    public String login(@RequestParam String name)
    {
        return  name;
    }
}


