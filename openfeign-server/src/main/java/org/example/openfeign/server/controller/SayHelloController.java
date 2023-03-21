package org.example.openfeign.server.controller;

import org.example.openfeign.api.SayHello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.concurrent.TimeUnit;

/**
 * @author Thomas Li
 * @date 2023/2/9
 */
@RestController
public class SayHelloController implements SayHello {
    @Override
    public String sayHello(@RequestParam("name") String name) {
        ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse().setStatus(500);
        return "Hello " + name;
    }
}
