package com.CashOrganizer.wallet.dto;


import com.CashOrganizer.wallet.Wallet;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class NewWalletDTO {
    Integer businessId;
    BigDecimal amountOfMoney;

    public static NewWalletDTO map(Wallet wallet){
        return NewWalletDTO.builder()
                .businessId(wallet.getBusinessId())
                .amountOfMoney(wallet.getAmountOfMoney())
                .build();
    }

    public  Wallet fromDTO(){
        return Wallet.builder()
                .businessId(businessId)
                .amountOfMoney(amountOfMoney)
                .build();
    }
}
