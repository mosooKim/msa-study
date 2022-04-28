package com.msa.userservice.service;

import com.msa.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
