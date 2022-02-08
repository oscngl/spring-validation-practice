package com.osc.spring_validation_practice.business.abstracts;

import com.osc.spring_validation_practice.entities.concretes.User;
import com.osc.spring_validation_practice.entities.dtos.UserDto;

import java.util.List;

public interface UserService {

    void add(UserDto userDto);
    List<User> getAll();

}
