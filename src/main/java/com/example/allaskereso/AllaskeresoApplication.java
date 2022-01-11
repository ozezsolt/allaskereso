package com.example.allaskereso;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class AllaskeresoApplication {
    public static void main(String[] args) {

        SpringApplication.run(AllaskeresoApplication.class, args);
    }



}
