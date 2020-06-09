package com.liyefei.spring.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

/**
 * @Author liyefei
 * @Date 2020/6/9 14:26
 **/
@Data
public class InitParam2 {

    @Value("${param2.offline}")
    private String offline;

    @Value("${param2.domain}")
    private String domain;

}
