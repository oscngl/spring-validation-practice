package com.osc.spring_validation_practice.api.controllers;

import com.osc.spring_validation_practice.business.abstracts.UserService;
import com.osc.spring_validation_practice.entities.concretes.User;
import com.osc.spring_validation_practice.entities.dtos.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> add(@Valid @RequestBody UserDto userDto) {
        userService.add(userDto);
        return ResponseEntity.ok("Successful!");
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

}
