package com.ahopgood;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public OpenAPI helloApi(@Value("${info.app.version}") String version) {
        return new OpenAPI()
                .info(new Info()
                        .title("Hello API")
                        .description("An API for saying hello.")
                        .version(version));
    }
}
