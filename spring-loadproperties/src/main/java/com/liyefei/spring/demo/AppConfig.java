package com.liyefei.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 通过@PropertySource注解实现配置文件加载需要取值和注解分开两个类
 * @Author liyefei
 * @Date 2020/6/9 15:56
 **/
@PropertySources({@PropertySource(value = "param2.properties")})
public class AppConfig {

    @Bean
    public InitParam2 initParam2(){
        return new InitParam2();
    }
}
