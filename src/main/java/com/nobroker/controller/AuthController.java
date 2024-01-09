package com.nobroker.controller;

import com.nobroker.entity.User;
import com.nobroker.payload.UserDto;
import com.nobroker.service.UserService;
import com.nobroker.util.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<UserDto> userfieldCreation(@RequestBody UserDto userDto, Model model) {
        UserDto dto = userService.userfieldCreation(userDto);
        emailService.sendEmail(dto.getEmail(), "message","user record saved successfully");
        model.addAttribute("msg","Record saved successfully");

        return new ResponseEntity<>(dto, HttpStatus.CREATED);


    }
    @GetMapping
    public List<User> getAllUserDetails(UserDto userDto){
        return userService.getAllUserDetails(userDto);
    }


}