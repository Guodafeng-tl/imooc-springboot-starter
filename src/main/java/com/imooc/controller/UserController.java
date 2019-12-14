package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: Dafeng
 * @date: 2019/7/11
 */


//@RestController=@Controller+@ResponseBody

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("www");
        user.setPassword("8888888");
        return  user;
    }

    @RequestMapping("/getUserJson")
    public IMoocJSONResult getUserJson(){
        User user=new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("www");
        user.setPassword("777777");
        return  IMoocJSONResult.ok(user);
    }

}
