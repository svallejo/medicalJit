package com.wadem.tourniquet.service.impl;

import com.wadem.tourniquet.service.JITTrainingService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
public class JITTrainingServiceImpl implements JITTrainingService {
    @Override
    public Mono<ServerResponse> provideJIT(ServerRequest request) {

        return ServerResponse.seeOther(URI.create("https://www.youtube.com/watch?v=LfC-BJdCg08")).build();
    }
}
