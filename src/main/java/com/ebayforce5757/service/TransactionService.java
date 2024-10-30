package com.ebayforce5757.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ebayforce5757.domain.Transaction;
import com.ebayforce5757.dto.TransactionDTO;
import com.ebayforce5757.dto.TransactionSearchDTO;
import com.ebayforce5757.dto.TransactionPageDTO;
import com.ebayforce5757.dto.TransactionConvertCriteriaDTO;
import com.ebayforce5757.service.GenericService;
import com.ebayforce5757.dto.common.RequestDTO;
import com.ebayforce5757.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface TransactionService extends GenericService<Transaction, Integer> {

	List<Transaction> findAll();

	ResultDTO addTransaction(TransactionDTO transactionDTO, RequestDTO requestDTO);

	ResultDTO updateTransaction(TransactionDTO transactionDTO, RequestDTO requestDTO);

    Page<Transaction> getAllTransactions(Pageable pageable);

    Page<Transaction> getAllTransactions(Specification<Transaction> spec, Pageable pageable);

	ResponseEntity<TransactionPageDTO> getTransactions(TransactionSearchDTO transactionSearchDTO);
	
	List<TransactionDTO> convertTransactionsToTransactionDTOs(List<Transaction> transactions, TransactionConvertCriteriaDTO convertCriteria);

	TransactionDTO getTransactionDTOById(Integer transactionId);







}





