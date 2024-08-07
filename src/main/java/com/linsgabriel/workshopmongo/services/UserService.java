package com.linsgabriel.workshopmongo.services;

import com.linsgabriel.workshopmongo.entities.User;
import com.linsgabriel.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll()
    {
        return userRepository.findAll();
    }



}
