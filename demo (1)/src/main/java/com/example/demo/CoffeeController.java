package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoffeeController {
    @GetMapping("/coffee")
    public ModelAndView coffee(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "아메리카노");
        modelAndView.setViewName("coffee");
        return modelAndView;

    }
}
