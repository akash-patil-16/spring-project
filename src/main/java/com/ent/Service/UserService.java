package com.ent.Service;

import com.ent.Entity.User;
import com.ent.Model.UserRequest;

import java.util.List;

public interface UserService {

    List<User> getUser();

    User saveUser(UserRequest userRequest);
}
