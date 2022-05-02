package com.msa.userservice.service;

import com.msa.userservice.dto.UserDto;
import com.msa.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
