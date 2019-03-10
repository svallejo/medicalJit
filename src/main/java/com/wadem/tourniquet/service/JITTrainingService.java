package com.wadem.tourniquet.service;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Web class to provide JIT training
 */
public interface JITTrainingService {

    Mono<ServerResponse> provideJIT(ServerRequest request);
}
