package com.weiyu.microService.chapter_2.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author weiyu1990520@163.com
 * @Description
 * @Date 21:45 2018/3/31
 */
@Component
@ConfigurationProperties(prefix = "my")
public class MyProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
