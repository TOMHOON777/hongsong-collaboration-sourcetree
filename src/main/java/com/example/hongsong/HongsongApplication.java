package com.example.hongsong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class HongsongApplication {

    public static void main(String[] args) {
        SpringApplication.run(HongsongApplication.class, args);
    }

}
