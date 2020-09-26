package com.github.codingdebugallday.repository;

import java.util.List;

import com.github.codingdebugallday.pojo.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/26 23:21
 * @since 1.0.0
 */
public interface PersonRepository extends CrudRepository<Person, String> {

    /**
     * 根据城市查询人
     * city必须生成二级索引才行
     *
     * @param city city
     * @return List<Person>
     */
    List<Person> findByAddressCity(String city);
}
