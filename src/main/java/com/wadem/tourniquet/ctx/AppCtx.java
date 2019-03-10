package com.wadem.tourniquet.ctx;

import com.wadem.tourniquet.service.JITTrainingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class AppCtx {
    @Bean
    public RouterFunction<ServerResponse> route(JITTrainingService service) {
        return RouterFunctions
                .route(RequestPredicates.GET("/jittraining"),service::provideJIT);
    }
}
