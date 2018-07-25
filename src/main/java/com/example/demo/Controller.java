package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/")
public class Controller {
    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String say()
    {
        return "hello,Spring-boot";
    }

}
