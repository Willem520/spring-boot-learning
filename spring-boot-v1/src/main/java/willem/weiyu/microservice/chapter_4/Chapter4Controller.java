package willem.weiyu.microservice.chapter_4;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author weiyu1990520@163.com
 * @Description
 * @Date 11:45 2018/06/30
 */
@RestController
@RequestMapping(value = "/v1/chapter_4")
public class Chapter4Controller {
    @Value("${my.name}")
    private String name;

    @ApiOperation(value = "获取配置文件中的属性值")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello,my name is "+name;
    }
}
