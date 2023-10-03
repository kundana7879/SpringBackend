package com.advquiz.stage.users.controller;

import com.advquiz.stage.users.Users;
import com.advquiz.stage.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/allUsers")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/fetchByGender/{gender}")
    public List<Users> fetchAllUsersByGender(@PathVariable("gender") String gender){
        return userService.getAllMenUsers(gender);
    }



}
