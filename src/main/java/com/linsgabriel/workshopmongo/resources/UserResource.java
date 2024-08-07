package com.linsgabriel.workshopmongo.resources;

import com.linsgabriel.workshopmongo.dto.UserDTO;
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
import java.util.stream.Collectors;

@Resource
@RestController
@RequestMapping(value = "/users")
public class UserResource
{
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll()
    {
        List<User> users = userService.findAll();
        List<UserDTO> userDTOs = users.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());


        return ResponseEntity.ok().body(userDTOs);
    }





}
