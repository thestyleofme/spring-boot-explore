package com.github.codingdebugallday.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/27 0:26
 * @since 1.0.0
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String toLoginPage(Model model) {
        model.addAttribute("currentYear", LocalDate.now().getYear());
        return "login";
    }

}
