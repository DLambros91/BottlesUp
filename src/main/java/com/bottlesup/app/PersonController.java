package com.bottlesup.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

    @GetMapping(path="/{id}", produces = "application/json")
    public Person getPerson(@PathVariable int id) {
        return new Person(id,"Chad");
    }

}