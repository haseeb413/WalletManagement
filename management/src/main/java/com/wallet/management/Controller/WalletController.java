package com.wallet.management.Controller;


import com.wallet.management.DTO.WalletDTO;
import com.wallet.management.Service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WalletController {

    @Autowired
    WalletService walletService;

    @PostMapping(path = "/createUserWallet")
    public String createWallet(@RequestBody WalletDTO wallet) {
        return walletService.createWallet(wallet);
    }
}
