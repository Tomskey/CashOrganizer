package com.CashOrganizer.wallet;


import com.CashOrganizer.operation.Operation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Wallet {

    @Id
    @GeneratedValue(generator = "uuid")
    private UUID uuid;


    @Column(name = "business_id")
    Integer businessId;

    @OneToMany(
            mappedBy = "wallet",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    List<Operation> operations;

    @Column(name = "amount_of_money")
    private BigDecimal amountOfMoney;


}
