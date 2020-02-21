package com.qianfeng.app;

import com.qianfeng.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.qianfeng.controller")  默认扫描的是当前包和当前包的子包
@SpringBootApplication(scanBasePackages = {"com.qianfeng.controller"}) //一个顶两个
public class BookApplications {
    public static void main(String[] args) {
        SpringApplication.run(BookApplications.class,args);
    }
}
