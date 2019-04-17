package willem.weiyu.microservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.WebClient;

import willem.weiyu.microservice.chapter_1.ChapterController;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 17:30
 */
@RunWith(SpringRunner.class)
@WebFluxTest(ChapterController.class)
public class TimeHandlerTest {
    public static final String BASE_URL = "http://localhost:9080";

    @Test
    public void sendTime() {
        WebClient client = WebClient.builder().baseUrl(BASE_URL).build();
        client.get().uri("/v2/chapter_1/hello").accept(MediaType.TEXT_PLAIN).retrieve().bodyToFlux(String.class).log().take(10).blockLast();
    }
}
