package com.example.logstream.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Profile("producer")
public class TestController {

	private static final Logger kafkaLogger = LoggerFactory.getLogger("kafkaAppender");
    
    @GetMapping("/hello")
    public void hello(@RequestParam(value = "name") String name) {
        try {
            if(name.equals("john")) {
                Integer.parseInt(name);
            }
            kafkaLogger.info("name:{}", name);
        } catch (Exception ee) {
            kafkaLogger.error(ee.getMessage(), ee);
        }
    }
}