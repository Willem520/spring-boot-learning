package willem.weiyu.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/15 16:05
 */
@SpringBootApplication
@RestController
public class BootStrapV1Application {

    public static void main(String[] args) {
        SpringApplication.run(BootStrapV1Application.class,args);
    }
}
