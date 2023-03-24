package com.myexpenditure.MyExpenditure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myexpenditure.MyExpenditure.entity.Account;
import com.myexpenditure.MyExpenditure.service.AccountService;

@RestController
@RequestMapping(value="/account")
public class AccountController {

	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value="/all")
	public Iterable<Account> getAllAccounts() {
		return accountService.findAllAccounts();
	}
	
	@GetMapping(value="/{acccountId}")
	public Account getAccount(@PathVariable Long acccountId) {
	
	return accountService.findBy(acccountId);
	}
	
	@PostMapping(value = "/create")
	public Account createAccount(@RequestBody Account accountObj ) {
		return accountService.CreateAccount(accountObj);
	}
	
	
	@DeleteMapping(value="/{acccountId}")
	public void deleteAccount(@PathVariable Long acccountId) {
		accountService.deleteAccount(acccountId);
	}
}
