package com.imooc.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.imooc.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedis;


    @RequestMapping("/test")
    public Object test(){
        strRedis.opsForValue().set("imooc-cache","hello 慕课网~~~~~");

        return strRedis.opsForValue().get("imooc-cache");
    }
}
