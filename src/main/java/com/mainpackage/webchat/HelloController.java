package com.mainpackage.webchat;

//数据库相关包
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;

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

    //使用这种可以直接避免参数不同
    //其中value的account参数要与底下的PathVariable相同，实现url绑定的一种方式。
//    @RequestMapping(value = "/{account}",method = RequestMethod.GET)
//    public String account(@PathVariable("account") String accountInfo )
//    {
//        return accountInfo;
//    }

    //测试mysql数据库连接情况 参考教程:https://www.jianshu.com/p/c440b57f4531
    @Autowired
    DataSource dataSource;

    @RequestMapping("/mysqltest")
    public Object mysqltest() throws Exception {
        Connection connect = dataSource.getConnection();
        PreparedStatement pre = connect.prepareStatement("select * from login_tb");
        ResultSet result = pre.executeQuery();
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        while (result.next()) {
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("id", result.getObject("id"));
            map.put("name", result.getObject("name"));
            list.add(map);
        }
        if(result!= null ) result.close();
        if(pre!= null ) pre.close();
        if(connect!= null ) connect.close();
        return list;
    }
}


