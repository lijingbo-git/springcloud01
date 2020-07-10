package com.ljb.spirngcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpirngcloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngcloudServerApplication.class, args);
    }

}
