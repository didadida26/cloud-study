package com.zjn.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author zjn
 * @date 2022/10/17 下午1:17
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level feignLogLevel(){
        // 日志级别为BASIC
        return Logger.Level.BASIC;
    }
}
