package org.example.openfeign.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Thomas Li
 * @date 2023/2/9
 */
@SpringBootApplication
public class SayHelloServer {
    public static void main(String[] args) {
        SpringApplication.run(SayHelloServer.class, args);
    }
}
