package com.example.potionsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import io.keploy.servlet.KeployMiddleware;
import org.springframework.context.annotation.Import;

@SpringBootApplication
// @Import(KeployMiddleware.class)
public class PotionsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PotionsApiApplication.class, args);
    }

}
