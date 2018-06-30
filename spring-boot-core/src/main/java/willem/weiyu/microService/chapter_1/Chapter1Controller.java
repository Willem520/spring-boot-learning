package willem.weiyu.microService.chapter_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author weiyu1990520@163.com
 * @Description
 * @Date 22:41 2018/3/31
 */
@RestController
@RequestMapping(value = "/chapter_1")
public class Chapter1Controller {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello,it is successful";
    }
}
