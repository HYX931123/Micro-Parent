package org.igetwell.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeignController {


    @PostMapping("/add")
    public double add(@RequestParam(value = "num1") double num1, @RequestParam(value = "num2") double num2){
        return num1+num2;
    }
}
