package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Dafeng
 * @date: 2019/7/11
 */

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return  "hello springboot dafengfeng";
    }


    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){
        Resource bean=new Resource();
        BeanUtils.copyProperties(resource,bean);
        return IMoocJSONResult.ok(bean);
    }
}
