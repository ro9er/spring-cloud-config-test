package com.roger.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: Yuanqing Luo
 * @date: 2018/8/30
 **/
@SpringBootApplication
@EnableConfigServer
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
