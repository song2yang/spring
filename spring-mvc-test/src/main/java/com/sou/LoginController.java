package com.sou;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller 
public class LoginController {

    @RequestMapping(value = "/login.htm")
    public String loginPage() { 
        return "login"; 
    }

    @RequestMapping(value = "/loginCheck.html") 
    public ModelAndView loginCheck(HttpServletRequest request) {
            return new ModelAndView("main"); 
    } 
}