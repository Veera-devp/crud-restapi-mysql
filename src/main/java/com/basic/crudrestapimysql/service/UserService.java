package com.basic.crudrestapimysql.service;

import com.basic.crudrestapimysql.dto.UserDto;
import com.basic.crudrestapimysql.entity.User;

import java.util.List;

public interface UserService
{
    /*User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long userId);*/
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
