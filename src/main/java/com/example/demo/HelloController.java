package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Bikram on 12/22/2017.
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
