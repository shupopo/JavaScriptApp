package com.example.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        return mav;
    }
}