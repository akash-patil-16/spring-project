package com.ent.Service;

import com.ent.Entity.User;
import com.ent.Model.UserRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUser();

    User saveUser(UserRequest userRequest);

    Optional<User> getUserById(Integer userId);

     String deleteUserById(Integer userId);
}
