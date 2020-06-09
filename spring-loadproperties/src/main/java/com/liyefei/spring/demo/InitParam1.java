package com.liyefei.spring.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author liyefei
 * @Date 2020/6/9 14:26
 **/
@Component
@Data
public class InitParam1 {

    @Value("${param1.offline}")
    private boolean offline;

    @Value("${param1.domain}")
    private String domain;
}
