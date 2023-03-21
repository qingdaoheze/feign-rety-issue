package org.example.openfeign.server.controller;

import org.example.openfeign.api.SayHello;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thomas Li
 * @date 2023/2/9
 */
@RestController
public class SayHelloController implements SayHello {
    @Override
    public String sayHello(String name) {
        throw new IllegalStateException("error");
    }
}
