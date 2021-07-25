package com.example.resume.api.controller;

import com.example.resume.Business.UserService;
import com.example.resume.Dto.Requests.UserRequest;
import com.example.resume.Dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserRequest request){
        return ResponseEntity.ok(this.userService.createUser(request));
    }
}
