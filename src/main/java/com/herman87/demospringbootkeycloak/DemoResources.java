package com.herman87.demospringbootkeycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoResources {

    @GetMapping("/hello-1")
    public String getHello1() {
        return "Hello word 1";
    }

    @GetMapping("/hello-2")
    public String getHello2() {
        return "Hello word 2 and keycloak admin";
    }
}
