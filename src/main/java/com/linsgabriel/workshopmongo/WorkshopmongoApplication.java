package com.linsgabriel.workshopmongo;

import com.linsgabriel.workshopmongo.config.TestConfig;
import com.linsgabriel.workshopmongo.entities.User;
import com.linsgabriel.workshopmongo.repositories.UserRepository;
import com.linsgabriel.workshopmongo.resources.UserResource;
import com.linsgabriel.workshopmongo.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {User.class, UserResource.class, UserService.class, UserRepository.class, TestConfig.class})
public class WorkshopmongoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(WorkshopmongoApplication.class, args);
    }

}
