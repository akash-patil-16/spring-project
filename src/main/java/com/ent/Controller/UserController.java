package com.ent.Controller;


import com.ent.Entity.User;
import com.ent.Model.UserRequest;
import com.ent.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/user/{userId}")
    public Optional<User> getUserById(@PathVariable Integer userId) {
        Optional<User> userList = userService.getUserById(userId);
        return userList; // or throw an exception if not found
    }

    @DeleteMapping("/delete/{userId}")
    public String deleteUserById(@PathVariable Integer userId) {
        String message = userService.deleteUserById(userId);
        return message ;
    }
}
