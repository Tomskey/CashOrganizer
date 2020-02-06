package com.CashOrganizer.operation.dto;


import com.CashOrganizer.operation.Operation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewOperationDTO {

    UUID operationId;
    String operationName;
    String category;
    Double amountOfMoney;

    public static NewOperationDTO map(Operation operation){
       return NewOperationDTO.builder()
               .operationId(operation.getOperationId())
               .operationName(operation.getOperationName())
               .category(operation.getCategory())
               .amountOfMoney(operation.getAmountInOperation())
               .build();
    }


}
