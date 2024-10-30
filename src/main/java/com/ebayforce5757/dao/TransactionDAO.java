package com.ebayforce5757.dao;

import java.util.List;

import com.ebayforce5757.dao.GenericDAO;
import com.ebayforce5757.domain.Transaction;





public interface TransactionDAO extends GenericDAO<Transaction, Integer> {
  
	List<Transaction> findAll();
	






}


