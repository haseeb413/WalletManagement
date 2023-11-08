package com.example.EurekaServer.Mapper;

import com.example.EurekaServer.DTO.UserDTO;
import com.example.EurekaServer.Entity.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-08T11:44:19+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDtoToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( userDTO.getId() );
        user.name( userDTO.getName() );
        user.address( userDTO.getAddress() );
        user.walletId( userDTO.getWalletId() );

        return user.build();
    }
}
