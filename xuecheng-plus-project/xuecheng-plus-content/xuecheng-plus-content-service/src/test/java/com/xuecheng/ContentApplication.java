package com.xuecheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lxh11111
 * @version 1.0
 * @description 内容管理服务启动类
 */
@EnableFeignClients(basePackages={"com.xuecheng.content.feignclient"})
@SpringBootApplication
public class ContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }
}
