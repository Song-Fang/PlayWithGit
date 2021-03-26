package com.songfang.testswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TestSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSwaggerApplication.class, args);
    }

}
