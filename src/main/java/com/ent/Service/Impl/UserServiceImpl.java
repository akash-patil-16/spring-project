package com.ent.Service.Impl;

import com.ent.Entity.User;
import com.ent.Model.UserRequest;
import com.ent.Repository.UserRepository;
import com.ent.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUser() {
        List<User> UseList = userRepository.findAll();
        return UseList;
    }

    @Override
    public User saveUser(UserRequest userRequest){
        User user = new User();
        user.setUserId(userRequest.getUserId());
        user.setUserName(userRequest.getUserName());
        user.setAddress(userRequest.getAddress());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }

    @Override
    public String deleteUserById(Integer userId) {
         userRepository.deleteById(userId);
         return "User deleted successfully";
    }
}
