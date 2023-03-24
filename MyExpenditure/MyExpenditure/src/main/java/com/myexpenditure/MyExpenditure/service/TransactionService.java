package com.myexpenditure.MyExpenditure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myexpenditure.MyExpenditure.entity.Transaction;
import com.myexpenditure.MyExpenditure.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;

	public Iterable<Transaction> findAllTransaction() {
		return transactionRepository.findAll();
	}
	
	public Transaction findBy(Long transactionId) {
		return transactionRepository.findById(transactionId).orElse(new Transaction());
	}
	
	
	public void deleteTransaction(Long transactionId) {
		transactionRepository.deleteById(transactionId);
	}
	
	public Transaction CreateTransaction(Transaction transactionObj)
	{
		return transactionRepository.save(transactionObj);
	}
}
