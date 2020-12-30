package com.example.demo.repository;

import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends DemoApplicationTests {

    @Autowired
    private UserRepositoryTest userRepository ;

    @Test
    public void create()
    {
        User user = new User();

        user.setAccount("TestUser");
        user.setEmail("TestUser@gmail.com");
        user.setPhoneNumber("01011111111");
        user.setCreateAt(LocalDateTime.now());
        user.setCreatedBy("admin");


        User newUser = userRepository.save(user);
        System.out.println("new User :"+newUser);
    }
    public void read()
    {

    }
    public void update(){


    }
    public void delete(){

    }
}
