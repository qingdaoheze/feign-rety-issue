package org.example.openfeign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Thomas Li
 * @date 2023/2/9
 */
@SpringBootApplication
@EnableFeignClients("org.example.openfeign.api")
@EnableWebMvc
//@EnableSwagger2
public class SayHelloClient {
    public static void main(String[] args) {
        SpringApplication.run(SayHelloClient.class, args);
    }
}
