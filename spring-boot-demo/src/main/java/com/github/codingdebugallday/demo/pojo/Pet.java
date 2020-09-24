package com.github.codingdebugallday.demo.pojo;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/24 1:25
 * @since 1.0.0
 */
public class Pet {

    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
