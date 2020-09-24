package com.github.codingdebugallday.config;

import com.github.codingdebugallday.pojo.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * /@ConditionalOnClass当类路径classpath下有指定类才会进行自动配置
 * </p>
 *
 * @author isaac 2020/09/25 1:34
 * @since 1.0.0
 */
@Configuration
@ConditionalOnClass(SimpleBean.class)
public class MyAutoConfiguration {

    static {
        System.out.println("MyAutoConfiguration init...");
    }

    @Bean
    public SimpleBean simpleBean(){
        return new SimpleBean();
    }
}
