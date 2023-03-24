package com.myexpenditure.MyExpenditure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myexpenditure.MyExpenditure.entity.Transaction;
import com.myexpenditure.MyExpenditure.service.TransactionService;

@RestController
@RequestMapping(value="/transaction")
public class TransactionController {
@Autowired
private TransactionService transactionService;
@GetMapping(value="/all")
public Iterable<Transaction> getAllTransaction() {
	return transactionService.findAllTransaction();
	
}
@PostMapping(value="/savetrans")
public Transaction createTransaction(@RequestBody  Transaction transactionObj) {
	return transactionService.CreateTransaction(transactionObj);
}

@DeleteMapping( value="/{transactionId}")
public void deleteTransaction(@PathVariable("transactionId") Long transactionId ) {
	transactionService.deleteTransaction(transactionId);
}

@GetMapping(value="/{transactionId}")
public Transaction getTransaction(@PathVariable("transactionId") Long transactionId) {
	return transactionService.findBy(transactionId);
}

}
