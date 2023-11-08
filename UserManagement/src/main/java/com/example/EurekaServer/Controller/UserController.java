package com.example.EurekaServer.Controller;

import com.example.EurekaServer.DTO.UserDTO;
import com.example.EurekaServer.FeignClient.Client;
import com.example.EurekaServer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody UserDTO userDTO){

        return  userService.createUser(userDTO);
    }
}
