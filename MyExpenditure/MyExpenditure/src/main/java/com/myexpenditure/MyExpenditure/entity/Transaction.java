package com.myexpenditure.MyExpenditure.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long transactionId;
	private long  amount;
	 private LocalDateTime timestamp;
	public Transaction(long amount, LocalDateTime timestamp) {
		super();
		this.amount = amount;
		this.timestamp = timestamp;
	}
	 
	public Transaction() {
		
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
