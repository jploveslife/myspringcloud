package com.jp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: jipeng
 * @Description:
 * @Date: Created in 2018/6/7 7:54
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigServiceApplication.class,args);

    }
}
