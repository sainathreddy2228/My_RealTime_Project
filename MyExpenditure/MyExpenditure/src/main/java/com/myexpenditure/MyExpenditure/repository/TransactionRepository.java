package com.myexpenditure.MyExpenditure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myexpenditure.MyExpenditure.entity.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
