package com.songfang.testswagger.controller;

import com.songfang.testswagger.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    List<User> users = new ArrayList<>();

    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return users;
    }

    @PostMapping("/addNew")
    public User saveUser(@RequestBody User user){
        users.add(user);
        return user;
    }
}
