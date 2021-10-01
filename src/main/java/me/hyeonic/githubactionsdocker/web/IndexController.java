package me.hyeonic.githubactionsdocker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "hello github actions!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }
}