package com.CashOrganizer.operation;

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
    private UUID id;

    @Column
    private String operationName;

    @Column
    private String category;

    @Column
    private Double amountOfMoney;


}
