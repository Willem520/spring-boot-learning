package willem.weiyu.microservice.config.router;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import willem.weiyu.microservice.chapter_1.TimeHandler;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 16:55
 */
@Configuration
public class RouterConfig {
    @Autowired
    private TimeHandler timeHandler;

    @Bean
    public RouterFunction<ServerResponse> timerRouter(){
        return route(GET("/v2/time"), req -> timeHandler.getTime(req))
                .andRoute(GET("/v2/date"), timeHandler::getDate)
                .andRoute(GET("/v2/times"), timeHandler::sendTimePerSec);
    }
}
