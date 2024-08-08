package com.linsgabriel.workshopmongo.services;

import com.linsgabriel.workshopmongo.dto.UserDTO;
import com.linsgabriel.workshopmongo.entities.User;
import com.linsgabriel.workshopmongo.repositories.UserRepository;
import com.linsgabriel.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll()
    {
        return userRepository.findAll();
    }

    public User findById(String id)
    {
        Optional<User> user = userRepository.findById(id);
        if (user == null) {
            throw new ObjectNotFoundException("User not found");
        }

        return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public User insert(User user)
    {
        return userRepository.insert(user);
    }

    public void delete(String id)
    {
        User user = findById(id);
        if (user != null)
        userRepository.deleteById(id);
    }


    public User fromDTO(UserDTO userDTO)
    {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }


}
