package com.weiyu.microService.chapter_2;

import com.weiyu.microService.chapter_2.properties.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author weiyu1990520@163.com
 * @Description
 * @Date 22:41 2018/3/31
 */
@RestController
@RequestMapping(value = "/chapter_2")
public class Chapter2Controller {
    @Value("${my.name}")
    private String name;

    @Autowired
    private MyProperties myProperties;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello,my name is "+name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String hello2(){
        return "hello2,my name is "+myProperties.getName();
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    public String hello3(){
        return "hello3,my name is "+environment.getProperty("my.name");
    }
}
