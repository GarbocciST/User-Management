package net.garboccist.springboot.service;

import net.garboccist.springboot.dto.UserDto;
import net.garboccist.springboot.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

   UserDto updateUser(UserDto user);

   void deleteUser(Long userId);
}
