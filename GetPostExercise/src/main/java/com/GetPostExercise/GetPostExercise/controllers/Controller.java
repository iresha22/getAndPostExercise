package com.GetPostExercise.GetPostExercise.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class Controller {

    @GetMapping("/name")
    public String getName(@RequestParam(required = true) String name) {
        return name;
    }

    @PostMapping("/name")
    public String postName(@RequestParam(required = true) String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        return stringBuilder.reverse().toString();
    }
}
