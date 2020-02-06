package com.CashOrganizer.operation;

import com.CashOrganizer.wallet.Wallet;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID operationId;

    @Column
    private String operationName;

    @Column
    private String category;

    @ManyToOne
    private Wallet wallet;

    @Column
    private Double amountInOperation;


}
