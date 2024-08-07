package com.linsgabriel.workshopmongo.resources;

import com.linsgabriel.workshopmongo.entities.User;
import com.linsgabriel.workshopmongo.services.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll()
    {
        return ResponseEntity.ok().body(userService.findAll());
    }





}
