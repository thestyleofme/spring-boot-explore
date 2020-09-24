package com.github.codingdebugallday.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <p>
 * /@PropertySource 自定义配置文件的名称和路径
 * </p>
 *
 * @author isaac 2020/09/24 2:12
 * @since 1.0.0
 */
@Component
@PropertySource("classpath:test.properties")
@ConfigurationProperties("test")
public class MyProperties {

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
