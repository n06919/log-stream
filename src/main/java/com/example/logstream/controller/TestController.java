package com.example.logstream.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Profile("producer")
public class TestController {

	private static final Logger kafkaLogger = LoggerFactory.getLogger("kafkaAppender");
    
    // @GetMapping("/debug")
    // public void hello(@RequestParam(value = "name") String name) {
    //     try {
    //         if(name.equals("john")) {
    //             Integer.parseInt(name);
    //         }
    //         kafkaLogger.info("name:{}", name);
    //     } catch (Exception ee) {
    //         kafkaLogger.error(ee.getMessage(), ee);
    //     }
    // }

    @GetMapping("/info")
    public void info() {
        try {
            kafkaLogger.info("info log test");
        } catch (Exception ee) {
            kafkaLogger.info(ee.getMessage(), ee);
        }
    }

    @GetMapping("/debug")
    public void _debug() {
        try {
            kafkaLogger.debug("debug log test");
        } catch (Exception ee) {
            kafkaLogger.debug(ee.getMessage(), ee);
        }
    }

    @GetMapping("/warn")
    public void warn() {
        try {
            kafkaLogger.warn("warn log test");
        } catch (Exception ee) {
            kafkaLogger.warn(ee.getMessage(), ee);
        }
    }

    @GetMapping("/error")
    public void error() {
        try {
            Integer.parseInt("abc");
        } catch (Exception ee) {
            kafkaLogger.error(ee.getMessage(), ee);
        }
    }
}