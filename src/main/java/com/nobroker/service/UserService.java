package com.nobroker.service;

import com.nobroker.entity.User;
import com.nobroker.payload.UserDto;

import java.util.List;

public interface UserService {
      public UserDto userfieldCreation(UserDto userDto);

      List<User> getAllUserDetails(UserDto userDto);
}
