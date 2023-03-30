package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	private TransactionService service;
	
	@GetMapping("/transactions")
	public List<Transaction> getTransactions() {
		return service.sortTransactions();
	}
	
//	@GetMapping("/transactions/{transactionId}")
	
}
