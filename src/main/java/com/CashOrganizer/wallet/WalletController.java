package com.CashOrganizer.wallet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    private WalletFacade walletFacade;

    public WalletController(WalletFacade walletFacade) {
        this.walletFacade = walletFacade;
    }

    @PutMapping
    public ResponseEntity<?> updateAmountInWallet(@PathVariable)
}
