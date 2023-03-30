package com.codercampus.Assignment11.service;

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
	
	public List<Transaction> sortTransactions() {
		List<Transaction> sortedTransactions = this.sort(Comparator.comparing(Transaction::getDate));
		return sortedTransactions;
		
	}

	private List<Transaction> sort(Comparator<Transaction> comparing) {
		
		return null;
	}
}
