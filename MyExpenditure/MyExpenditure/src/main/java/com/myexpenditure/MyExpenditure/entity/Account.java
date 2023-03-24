package com.myexpenditure.MyExpenditure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long acccountId;
	
	private String accountNo;

	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}
	public Account() {
		
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	
	
	
}
