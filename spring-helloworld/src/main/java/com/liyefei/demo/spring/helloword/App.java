package com.liyefei.demo.spring.helloword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liyefei
 * @Date 2020/6/8 17:15
 **/
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        System.out.println(helloWorld.getMessage());
    }
}
