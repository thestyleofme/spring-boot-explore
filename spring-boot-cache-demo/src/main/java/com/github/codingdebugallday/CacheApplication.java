package com.github.codingdebugallday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * <p>
 * /@EnableCaching开启spring boot基于注解的缓存管理支持
 * </p>
 *
 * @author isaac 2020/09/27 2:51
 * @since 1.0.0
 */
@EnableCaching
@SpringBootApplication
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }

}
