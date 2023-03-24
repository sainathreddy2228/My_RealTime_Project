package com.myexpenditure.MyExpenditure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myexpenditure.MyExpenditure.entity.Account;
import com.myexpenditure.MyExpenditure.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;

//Retrive all accounts == Findall
	public Iterable<Account> findAllAccounts() {
		return accountRepository.findAll();

	}

//Retrive Single accounts == Findby

	public Account findBy(Long acccountId) {
		return accountRepository.findById(acccountId).orElse(new Account());
	}

//Delete Account
	public void deleteAccount(Long accountId) {
		accountRepository.deleteById(accountId);
	}

//inserting data
	public Account CreateAccount(Account  acccountObj) {
		return accountRepository.save( acccountObj);
	}

}
