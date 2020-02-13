package com.CashOrganizer.wallet;

import com.CashOrganizer.wallet.dto.NewWalletDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    private WalletFacade walletFacade;

    public WalletController(WalletFacade walletFacade) {
        this.walletFacade = walletFacade;
    }

    @PostMapping("/addWallet")
    public ResponseEntity<?> addNewWallet(@RequestBody NewWalletDTO newWalletDTO){
        return new ResponseEntity<>(walletFacade.addNewWallet(newWalletDTO), HttpStatus.OK);
    }
}
