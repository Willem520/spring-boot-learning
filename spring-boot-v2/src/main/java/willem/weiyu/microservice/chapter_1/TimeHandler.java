package willem.weiyu.microservice.chapter_1;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 16:46
 */
@Component
public class TimeHandler {

    public Mono<ServerResponse> getTime(ServerRequest request) {
        return ok().contentType(MediaType.TEXT_PLAIN).body(Mono.just("current time is" + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))), String.class);
    }

    public Mono<ServerResponse> getDate(ServerRequest serverRequest) {
        return ok().contentType(MediaType.TEXT_PLAIN)
                .body(Mono.just("current date is " + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
                        String.class);
    }

    public Mono<ServerResponse> sendTimePerSec(ServerRequest request) {
        return ok().contentType(MediaType.TEXT_EVENT_STREAM)
                .body(Flux.interval(Duration.ofSeconds(1)).map(l -> LocalTime.now().format(DateTimeFormatter.ISO_TIME)),
                        String.class);
    }
}
