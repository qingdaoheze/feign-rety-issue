package org.example.openfeign.client.controller;

import org.example.openfeign.api.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thomas Li
 * @date 2023/2/9
 */
@RestController
public class InvokeSayHelloController {
    @Autowired
    private SayHello sayHello;

    @GetMapping("/say-hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "john") String name) {
        return sayHello.sayHello(name);
    }
}
