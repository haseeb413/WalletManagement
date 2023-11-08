package Mapper;

import Entity.DTO.WalletDTO;
import Entity.Wallet;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-08T12:34:33+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
public class MapStructImpl implements MapStruct {

    @Override
    public Wallet walletDtoToWalled(WalletDTO walletDTO) {
        if ( walletDTO == null ) {
            return null;
        }

        Wallet.WalletBuilder wallet = Wallet.builder();

        wallet.userId( walletDTO.getUserId() );

        return wallet.build();
    }

    @Override
    public WalletDTO walletToWalletDto(Wallet wallet) {
        if ( wallet == null ) {
            return null;
        }

        WalletDTO.WalletDTOBuilder walletDTO = WalletDTO.builder();

        walletDTO.userId( wallet.getUserId() );
        walletDTO.balance( wallet.getBalance() );

        return walletDTO.build();
    }
}
