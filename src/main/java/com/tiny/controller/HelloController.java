package com.tiny.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tiny
 * on 1/20/17.
 */
@RestController("/hello")
public class HelloController {

    @GetMapping("/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

}
