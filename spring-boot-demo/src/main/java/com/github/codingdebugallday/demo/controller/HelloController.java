package com.github.codingdebugallday.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/24 1:07
 * @since 1.0.0
 */
@RestController
public class HelloController {

    @RequestMapping("/demo")
    public String demo(){
        return "hello, springboot!";
    }
}
