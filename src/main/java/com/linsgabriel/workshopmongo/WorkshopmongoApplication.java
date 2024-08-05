package com.linsgabriel.workshopmongo;

import com.linsgabriel.workshopmongo.entities.User;
import com.linsgabriel.workshopmongo.resources.UserResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {User.class, UserResource.class})
public class WorkshopmongoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(WorkshopmongoApplication.class, args);
    }

}
