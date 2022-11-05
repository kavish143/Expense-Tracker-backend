package com.expense.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.expense.entity.Expense;
@Service
public interface ExpenseService {

	List<Expense> findAll();
	
	void save(Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);
}
