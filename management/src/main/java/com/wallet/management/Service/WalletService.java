package com.wallet.management.Service;


import com.wallet.management.DTO.WalletDTO;

public interface WalletService {

    String createWallet(WalletDTO walletDTO);


    WalletDTO getWalletById(Long id);
}
