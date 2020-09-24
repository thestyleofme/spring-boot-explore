package com.github.codingdebugallday.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/24 2:20
 * @since 1.0.0
 */
@Configuration
public class MyConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
