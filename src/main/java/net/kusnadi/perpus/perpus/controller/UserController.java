package net.kusnadi.perpus.perpus.controller;


import net.kusnadi.perpus.perpus.entity.User;
import net.kusnadi.perpus.perpus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<User> getUsers(){
        Iterable<User> users = userRepository.findAll();
        return users;
    }
}
