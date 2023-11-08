package com.example.EurekaServer.Mapper;

import com.example.EurekaServer.DTO.UserDTO;
import com.example.EurekaServer.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userDtoToUser(UserDTO userDTO);

}