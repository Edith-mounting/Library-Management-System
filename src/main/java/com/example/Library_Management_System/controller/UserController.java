package com.example.Library_Management_System.controller;

import com.example.Library_Management_System.pojo.Users;
import com.example.Library_Management_System.repository.UserRepository;
import com.example.Library_Management_System.request.UserRequest;
import com.example.Library_Management_System.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/create/user")
    public UserResponse createUser(@RequestBody UserRequest userRequest){
        Users user = mappingFromRequestToEntity(userRequest);
        Users user1 = userRepository.save(user);
        return mappingEntityToResponse(user1);
    }
    Users mappingFromRequestToEntity(UserRequest userRequest){
        Users newUser = new Users();
        newUser.setUserName(userRequest.getUserName());
        newUser.setUserType(userRequest.getUserType());
        return newUser;
    }
    UserResponse mappingEntityToResponse(Users user){
        UserResponse userResponse = new UserResponse();
        userResponse.setUid(user.getUID());
        userResponse.setStatus(HttpStatus.OK.name());
        userResponse.setCode(HttpStatus.OK.value());
        return userResponse;
    }
}
