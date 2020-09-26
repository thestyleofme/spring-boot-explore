package com.github.codingdebugallday.pojo;

import javax.persistence.Id;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * <p>
 * /@RedisHash 指定实体类对象在redis中的存储空间
 * </p>
 *
 * @author isaac 2020/09/26 23:11
 * @since 1.0.0
 */
@RedisHash(value = "persons")
public class Person {

    /**
     * hash key
     */
    @Id
    private String id;
    /**
     * 用来标识对应属性在redis中生成二级索引
     */
    @Indexed
    private String firstName;
    @Indexed
    private String lastName;
    private Address address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
