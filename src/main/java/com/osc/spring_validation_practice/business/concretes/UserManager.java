package com.osc.spring_validation_practice.business.concretes;

import com.osc.spring_validation_practice.business.abstracts.UserService;
import com.osc.spring_validation_practice.dataAccess.abstracts.UserDao;
import com.osc.spring_validation_practice.entities.concretes.User;
import com.osc.spring_validation_practice.entities.dtos.UserDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserDao userDao;
    private final ModelMapper modelMapper;

    @Override
    public void add(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userDao.save(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

}
