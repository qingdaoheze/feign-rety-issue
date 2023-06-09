package org.example.openfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Thomas Li
 * @date 2023/2/9
 */
@FeignClient("hello-server")
public interface SayHello {
    @GetMapping("/sayHello")
    String sayHello(@RequestParam("name") String name);
}
