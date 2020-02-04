package com.CashOrganizer.operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cash")
public class OperationController {

    private OperationFacade operationFacade;


    @PostMapping("/setExpense")
    public ResponseEntity<?> setExpense(){
        return null;
    }

    public ResponseEntity<Operation> setIncome(){
        return null;
    }

}
