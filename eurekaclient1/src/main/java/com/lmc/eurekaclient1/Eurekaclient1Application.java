package com.lmc.eurekaclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class Eurekaclient1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient1Application.class, args);
        // HashMap hashMap = new HashMap(100);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }

}
