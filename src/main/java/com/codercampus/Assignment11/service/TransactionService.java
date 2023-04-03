package com.codercampus.Assignment11.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
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
	
	private Transaction domain = new Transaction();
	
	
	public List<Transaction> getTransactions() {
		TransactionRepository repository = new TransactionRepository();
//		System.out.println(repository.findAll());
		System.out.println(sortTransactions());
		return repository.findAll();
	}
	
	public List<Transaction> sortTransactions() {
		Collections.sort(domain, (t1, t2) -> t1.getDate().compareTo(t2.getDate()));
		return getTransactions();
	}

	public Transaction findById(Long transactionId) {
		List<Transaction> transactions = repository.findAll();
		
		for (Transaction transaction : transactions) {
			if (transaction.getId().equals(transactionId)) {
				System.out.println("Record found");
				return transaction;
			}
		}
		System.out.println("Record not");
		return null;
	}
}
