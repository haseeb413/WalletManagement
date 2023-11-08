package Service;

import Entity.DTO.WalletDTO;

public interface WalletService {

    String createWallet(WalletDTO walletDTO);


    WalletDTO getWalletById(Long id);
}
