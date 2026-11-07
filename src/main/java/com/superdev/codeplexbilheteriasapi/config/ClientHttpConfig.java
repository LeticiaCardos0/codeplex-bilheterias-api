package com.superdev.codeplexbilheteriasapi.config;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClienteHttpConfig {

@Bean public RestClient pagamentosClient(
        @Value("${PAGAMENTOS_URL:http://localhost:8080}") String url) {
        return RestClient.builder() .baseUrl(url) .build(); }
}
