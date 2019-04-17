package willem.weiyu.microservice.chapter_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * @Author weiyu005
 * @Description
 * @Date 2019/4/17 16:30
 */
@RestController
@RequestMapping("/v2/chapter_1")
public class ChapterController {

    @GetMapping("/hello")
    public Mono<String> hello(){
        return Mono.just("hello,this from SpringBoot v2");
    }
}
