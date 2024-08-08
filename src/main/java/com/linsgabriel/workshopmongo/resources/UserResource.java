package com.linsgabriel.workshopmongo.resources;

import com.linsgabriel.workshopmongo.dto.UserDTO;
import com.linsgabriel.workshopmongo.entities.User;
import com.linsgabriel.workshopmongo.services.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id)
    {
        User user = userService.findById(id);
        UserDTO userDTO = new UserDTO(user);

        return ResponseEntity.ok().body(userDTO);
    }

    @PostMapping
    public ResponseEntity<UserDTO> insert(@RequestBody UserDTO userDTO)
    {
        User user = userService.fromDTO(userDTO);
        user = userService.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id)
    {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
