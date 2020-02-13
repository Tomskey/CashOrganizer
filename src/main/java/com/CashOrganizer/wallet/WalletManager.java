package com.CashOrganizer.wallet;

import com.CashOrganizer.wallet.dto.NewWalletDTO;

class WalletManager {
    private WalletRepository walletRepository;

    WalletManager(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    void updateAmountInWallet(Double amountOfMoney) {

    }

    Wallet addNewWallet(NewWalletDTO newWalletDTO) {
        Wallet wallet = newWalletDTO.fromDTO();
        return walletRepository.save(wallet);
    }
}
