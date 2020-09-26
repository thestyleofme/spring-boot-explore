package com.github.codingdebugallday;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/26 22:31
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = {
        "com.github.codingdebugallday.mapper"
})
public class SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }
}
