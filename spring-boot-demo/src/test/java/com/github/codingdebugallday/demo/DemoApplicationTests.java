package com.github.codingdebugallday.demo;

import com.github.codingdebugallday.demo.controller.HelloController;
import com.github.codingdebugallday.demo.pojo.MyProperties;
import com.github.codingdebugallday.demo.pojo.Person;
import com.github.codingdebugallday.demo.pojo.Student;
import com.github.codingdebugallday.pojo.SimpleBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private HelloController helloController;

    @Autowired
    private Person person;
    @Autowired
    private Student student;
    @Autowired
    private MyProperties myProperties;
    @Autowired
    private ApplicationContext applicationContext;
    @Value("${tom.desc}")
    private String tomDesc;
    @Autowired
    private SimpleBean simpleBean;

    @Test
    void contextLoads() {
        // String demo = helloController.demo();
        // System.out.println(demo);
        // System.out.println(person);
        // System.out.println(student);
        // System.out.println(myProperties);
        // System.out.println(applicationContext.containsBean("myService"));
        // System.out.println(tomDesc);
        System.out.println(simpleBean);
    }

}
