package com.liyefei.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author liyefei
 * @Date 2020/6/9 14:29
 **/
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        //方式1：通过<context:property-placeholder>标签
        InitParam1 initParam = (InitParam1) context.getBean("initParam1");
        System.out.println("method1:" + initParam);

        //方式2：通过@PropertySource注解实现配置文件加载
        AnnotationConfigApplicationContext annoContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //方式2.1 通过getBean方法获取参数
        InitParam2 initParam2 = annoContext.getBean(InitParam2.class);
        System.out.println("method2:" + initParam2);
        //方式2.2 通过getEnvironment获取参数
        ConfigurableEnvironment environment = annoContext.getEnvironment();
        String offline = environment.getProperty("param2.offline");
        String domain = environment.getProperty("param2.domain");
        System.out.println("domain:" + domain + ",offline:" + offline);

        //方式3：通过PropertyPlaceholderConfigurer类实现配置文件加载
        InitParam3 initParam3 = (InitParam3) context.getBean("initParam3");
        System.out.println("method3:" + initParam3);

    }
}
