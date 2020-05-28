package com.shiki.database.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author shiki
 */
@SpringBootApplication
//开启aop对类内部方法调用的代理
//在接口上使用注解会使cglib代理失效
@EnableAspectJAutoProxy(exposeProxy = true)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
