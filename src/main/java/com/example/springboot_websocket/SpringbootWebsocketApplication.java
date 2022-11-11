package com.example.springboot_websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class SpringbootWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebsocketApplication.class, args);
    }

}
