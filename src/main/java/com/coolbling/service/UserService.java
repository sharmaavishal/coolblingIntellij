package com.coolbling.service;

import com.coolbling.dto.UserDto;
import com.coolbling.entity.User;


import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
