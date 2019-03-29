package com.bing.lan.starter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lan_bing
 * @date 2019-03-29 14:30
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    String index() {
        return "Hello Spring Boot!";
    }
}