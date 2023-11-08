package com.wallet.management.Mapper;


import com.wallet.management.DTO.WalletDTO;
import com.wallet.management.Entity.Wallet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MapStruct {


    MapStruct INSTANCE = Mappers.getMapper(MapStruct.class);

    Wallet walletDtoToWalled(WalletDTO walletDTO);
    WalletDTO walletToWalletDto(Wallet wallet);


}
