package com.CashOrganizer.wallet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WalletConfiguration {

    @Bean
   public static WalletFacade walletFacade(WalletRepository walletRepository){
        WalletManager walletManager = new WalletManager(walletRepository);

        return new WalletFacade(walletManager);
    }
}
