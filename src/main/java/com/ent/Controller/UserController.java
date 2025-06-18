package com.ent.Controller;


import com.ent.Entity.User;
import com.ent.Model.UserRequest;
import com.ent.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
   private UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        List<User> UserList = userService.getUser();
        return UserList;
    }

    @PostMapping(value = "/saveUser",produces = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody UserRequest userRequest) {
        return userService.saveUser(userRequest);
    }
}
