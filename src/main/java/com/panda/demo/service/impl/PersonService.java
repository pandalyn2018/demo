package com.panda.demo.service.impl;

import com.panda.demo.entity.Person;
import com.panda.demo.mapper.PersonMapper;
import com.panda.demo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    public Long insert(Person person) {
        personMapper.insert(person);
        return person.getId();
    }
}
