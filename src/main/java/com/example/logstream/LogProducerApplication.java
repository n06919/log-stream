package com.example.logstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("producer")
public class LogProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogProducerApplication.class, args);
    }

}
