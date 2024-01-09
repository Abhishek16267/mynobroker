package com.nobroker.service.impl;

import com.nobroker.entity.User;
import com.nobroker.payload.UserDto;
import com.nobroker.repository.UserRepository;
import com.nobroker.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto userfieldCreation(UserDto userDto) {
        User user = mapToEntity(userDto);
        User save = userRepository.save(user);
         return mapToDto(save);

    }

    @Override
    public List<User> getAllUserDetails(UserDto userDto) {
        User user = mapToEntity(userDto);
        List<User> details = userRepository.findAll();
        return details;

    }

    User mapToEntity(UserDto userDto){
        User user = modelMapper.map(userDto, User.class);
        return user;
    }
    UserDto mapToDto(User user){
        UserDto dto = modelMapper.map(user, UserDto.class);
        return dto;
    }
}
