package com.linsgabriel.workshopmongo.resources;

import com.linsgabriel.workshopmongo.entities.User;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Resource
@RestController
@RequestMapping(value = "/users")
public class UserResource
{

    @GetMapping
    public ResponseEntity<List<User>> findAll()
    {
        User maria = new User("1","maria","maria@gmail.com");
        User alex = new User("2","alex","alex@gmail.com");
        List<User> users = new ArrayList<User>();

        users.add(maria);
        users.add(alex);
        return ResponseEntity.ok().body(users);
    }




}
