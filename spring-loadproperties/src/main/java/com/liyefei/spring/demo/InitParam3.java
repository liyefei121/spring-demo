package com.liyefei.spring.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author liyefei
 * @Date 2020/6/9 14:26
 **/
@Data
@Component
public class InitParam3 {

    @Value("${param3.offline}")
    private boolean offline;

    @Value("${param3.domain}")
    private String domain;
}
