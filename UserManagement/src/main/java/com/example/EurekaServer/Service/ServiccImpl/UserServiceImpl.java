package com.example.EurekaServer.Service.ServiccImpl;

import com.example.EurekaServer.DTO.UserDTO;
import com.example.EurekaServer.Entity.User;
import com.example.EurekaServer.Mapper.UserMapper;
import com.example.EurekaServer.Repository.UserRepo;
import com.example.EurekaServer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    @Override
    public String createUser(UserDTO userDTO) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDTO);
        userRepo.save(user);
        return "User Created";
    }
}
