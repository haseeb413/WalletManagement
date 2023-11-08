package com.wallet.management.Mapper;

import com.wallet.management.DTO.WalletDTO;
import com.wallet.management.Entity.Wallet;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-08T16:34:49+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_392 (Amazon.com Inc.)"
)
public class MapStructImpl implements MapStruct {

    @Override
    public Wallet walletDtoToWalled(WalletDTO walletDTO) {
        if ( walletDTO == null ) {
            return null;
        }

        Wallet.WalletBuilder wallet = Wallet.builder();

        wallet.userId( walletDTO.getUserId() );
        wallet.balance( walletDTO.getBalance() );

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
