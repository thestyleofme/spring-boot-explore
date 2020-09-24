package com.github.codingdebugallday.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/25 1:26
 * @since 1.0.0
 */
@EnableConfigurationProperties(SimpleBean.class)
@ConfigurationProperties(prefix = "simple")
public class SimpleBean {

    private int id;
    private String name;

    @Override
    public String toString() {
        return "SimpleBean{" +
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
