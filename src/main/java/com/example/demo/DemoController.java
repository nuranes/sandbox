package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestwMapping(
            path = "hei"
    )
    public String bla () {
        return "Hei";
    }
}
