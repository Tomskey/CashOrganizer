package com.CashOrganizer.wallet;

public class WalletFacade {

    WalletManager walletManager;

    public WalletFacade(WalletManager walletManager) {
        this.walletManager = walletManager;
    }

    public boolean updateAmountInWallet(Double amountInWallet){
        return walletManager.updateAmountInWallet(amountInWallet);
    }
}
