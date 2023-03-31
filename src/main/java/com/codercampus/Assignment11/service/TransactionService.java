package com.codercampus.Assignment11.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;
	
	public List<Transaction> getTransactions() {
		TransactionRepository repository = new TransactionRepository();
		System.out.println(repository.findAll());
		return repository.findAll();
	}

	public Transaction findById(Long transactionId) {
		Transaction transaction = new Transaction();
		Long id = transaction.getId();
		String retailer = transaction.getRetailer();
		String description = transaction.getDescription();
		LocalDateTime date = transaction.getDate();
		BigDecimal amount = transaction.getAmount();
		String type = transaction.getType();
		
		System.out.println("ta-da");
		return findById(transactionId);
	}
}
