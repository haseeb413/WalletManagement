package Service.WalletServiceImpl;

import Entity.DTO.WalletDTO;
import Entity.Wallet;
import Mapper.MapStruct;
import Repository.WalletRepository;
import Service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    WalletRepository walletRepository;
    @Override
    public String createWallet(WalletDTO walletDTO) {
//        Wallet wallet = new Wallet();
//        wallet.setUserId(walletDTO.getUserId());
//        wallet.setBalance(walletDTO.getBalance());

        Wallet wallet = MapStruct.INSTANCE.walletDtoToWalled(walletDTO);
        walletRepository.save(wallet);
        return "Walled Created.";
    }

    @Override
    public WalletDTO getWalletById(Long id) {

       Wallet wallet =  walletRepository.getReferenceById(id);
       WalletDTO walletDTO = MapStruct.INSTANCE.walletToWalletDto(wallet);
       return  walletDTO;


    }

}
