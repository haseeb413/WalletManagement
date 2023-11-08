package Mapper;

import Entity.DTO.WalletDTO;
import Entity.Wallet;
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
