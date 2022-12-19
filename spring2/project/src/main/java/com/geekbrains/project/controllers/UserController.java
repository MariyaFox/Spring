package com.geekbrains.project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.geekbrains.project.dtos.JwtResponse;
import com.geekbrains.project.dtos.UserDto;
import com.geekbrains.project.error_handling.ResourceNotFoundException;
import com.geekbrains.project.models.User;
import com.geekbrains.project.services.UserService;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/me")
    public UserDto getCurrentUsername(Principal principal) {
        User currentUser = userService.findByUsername(principal.getName()).orElseThrow(() -> new ResourceNotFoundException("Models.User doesn't exist"));
        return new UserDto(currentUser.getUsername(), currentUser.getEmail());
    }

    @PostMapping("/register") // todo заменить при решении домашнего задания
    public void register(@RequestBody UserDto userDto) {
        userDto.setEmail(passwordEncoder.encode(userDto.getEmail())); // encode email to bcrypt
    }
}
