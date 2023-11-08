package com.example.EurekaServer.FeignClient;

import com.example.EurekaServer.DTO.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "client-service", url = "http://localhost:8081")
public interface Client {

    @PostMapping("/createUser")
    public String createUser(@RequestBody UserDTO userDTO);


}
