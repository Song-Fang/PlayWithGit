package com.songfang.testswagger.controller;

import com.songfang.testswagger.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    List<User> users = new ArrayList<>();

    @GetMapping("/users")
    public List<User> getAllUsers(){
        User user = new User(3,"Peter",22);
        users.add(user);
        return users;
    }

    @PostMapping("/addNew")
    public User saveUser(@RequestBody User user){
        users.add(user);
        return user;
    }
}
