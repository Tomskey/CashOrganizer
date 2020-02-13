package com.CashOrganizer.wallet;

import com.CashOrganizer.wallet.dto.NewWalletDTO;

import javax.transaction.Transactional;

@Transactional
public class WalletFacade {

    WalletManager walletManager;

    public WalletFacade(WalletManager walletManager) {
        this.walletManager = walletManager;
    }

     Wallet addNewWallet(NewWalletDTO newWalletDTO){
        return walletManager.addNewWallet(newWalletDTO);
    }
}
