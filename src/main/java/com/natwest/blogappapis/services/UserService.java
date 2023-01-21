package com.natwest.blogappapis.services;

import com.natwest.blogappapis.entities.User;
import com.natwest.blogappapis.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(Integer userId);
    List<UserDto>getAllUsers();
    void deleteUser(Integer userId);
}
