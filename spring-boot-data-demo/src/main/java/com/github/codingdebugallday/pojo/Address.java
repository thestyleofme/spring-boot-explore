package com.github.codingdebugallday.pojo;

import org.springframework.data.redis.core.index.Indexed;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/26 23:12
 * @since 1.0.0
 */
public class Address {

    @Indexed
    private String city;
    @Indexed
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
