package willem.weiyu.microService.chapter_3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author weiyu1990520@163.com
 * @Description
 * @Date 15:01 2018/5/5
 */
@RestController
@RequestMapping(value = "/chapter_3")
public class Chapter3Controller {
    @Value("${my.name}")
    private String name;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello,my name is "+name;
    }
}
