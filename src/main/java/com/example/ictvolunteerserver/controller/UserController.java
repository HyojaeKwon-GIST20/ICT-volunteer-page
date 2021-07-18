package com.example.ictvolunteerserver.controller;

import com.example.ictvolunteerserver.domain.User;
import com.example.ictvolunteerserver.repository.PostRepository;
import com.example.ictvolunteerserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public PostRepository postRepository;

    @GetMapping("")
    public List<User> retrieveAllUsers(){
        return userRepository.findAll();
    }

}
