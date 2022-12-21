package com.example.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayRouting {

    @Bean
    public RouteLocator locator(RouteLocatorBuilder builder ) {
        return builder.routes()
                .route("itemId", r -> r.path("/item/info").uri("http://localhost:8081"))
                .route("edgeId", r -> r.path("/edge/info").uri("http://localhost:8082"))
                .build();
    }
}
