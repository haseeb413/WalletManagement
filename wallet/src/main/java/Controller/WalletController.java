package Controller;

import Entity.DTO.WalletDTO;
import Service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class WalletController {

    @Autowired
    WalletService walletService;

    @PostMapping("/createWallet")
    public String createWallet(@RequestBody WalletDTO walletDTO){

      return  walletService.createWallet(walletDTO);
    }
}
