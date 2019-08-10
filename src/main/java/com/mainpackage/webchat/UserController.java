package com.mainpackage.webchat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import java.net.http.HttpRequest;

//用户类
@Controller
public class UserController {

    //登录模块测试
    @RequestMapping(value="/userlogin",method = RequestMethod.GET)
    //map 可以被传到前端去
    public String login(Map <String, Object> map)
    {
        map.put("message2","mm");
        //name = "测试";
        return  "passparam";
    }

    //登录模块测试
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    //map 可以被传到前端去
    public String hello(Map <String, Object> map)
    {
        map.put("message2","mm");
        //name = "测试";
        return  "hello";
    }
}
