package com.CashOrganizer.wallet;


import com.CashOrganizer.operation.Operation;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @OneToMany(
            mappedBy = "wallet",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    List<Operation> operations;

    @Column
    private Double amountOfMoney;

}
