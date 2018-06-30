package com.panda.demo.controller;

import com.panda.demo.entity.Person;
import com.panda.demo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;

    @PostMapping("/person/insert")
    public long insert(Person person) {
        person = new Person();
        person.setAge(18);
        person.setBirthday(new Date());
        person.setUsername("韩梅梅");
        return personService.insert(person);
    }
}
