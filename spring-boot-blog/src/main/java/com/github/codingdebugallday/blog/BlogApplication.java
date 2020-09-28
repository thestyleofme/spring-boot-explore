package com.github.codingdebugallday.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/28 9:44
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = {
		"com.github.codingdebugallday.blog.mapper"
})
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
