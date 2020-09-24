package com.github.codingdebugallday.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/24 2:02
 * @since 1.0.0
 */
@Component
public class Student {

    @Value("3")
    private int id;
    @Value("${person.name}")
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
