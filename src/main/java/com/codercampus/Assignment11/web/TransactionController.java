package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	private TransactionService service;
	
	@GetMapping("/transactions")
	public List<Transaction> getTransactions(ModelMap model) {
		List<Transaction> transactions = service.getTransactions();
		Transaction transaction = new Transaction(); //from domain package
		
		model.put("transactions", transactions);
		model.put("transaction", transaction);
		return transactions;
	}
	
	@GetMapping("/transactions/{transactionId}")
	public Transaction getTransactionById(@PathVariable Long transactionId, ModelMap model) {
		Transaction transaction = service.findById(transactionId);
		return transaction;
	}
}
