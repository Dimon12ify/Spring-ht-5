package com.example.task5;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {
    @PostMapping("person")
    public String addPerson(@Valid @RequestBody Person person) {
        return "Person is valid";
    }
}
