package com.linsgabriel.workshopmongo.dto;

import com.linsgabriel.workshopmongo.entities.User;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class UserDTO implements Serializable
{
    @Id
    private String id;
    private String name;
    private String email;

    public UserDTO()
    {
    }

    public UserDTO(String id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserDTO(User user)
    {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }


}