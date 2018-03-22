package com.weiyu.microService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootStrapApplication {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello,it is successful";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootStrapApplication.class,args);
    }
}
