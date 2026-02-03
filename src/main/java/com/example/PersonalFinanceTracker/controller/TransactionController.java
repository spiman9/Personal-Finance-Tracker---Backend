package com.example.PersonalFinanceTracker.controller;

import com.example.PersonalFinanceTracker.model.Transaction;
import com.example.PersonalFinanceTracker.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService service;

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }

    @PutMapping("/{id}")
    public Transaction updateTransaction(
            @PathVariable Long id,
            @RequestBody Transaction transaction) {

        transaction.setId(id);
        return service.save(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        service.delete(id);
    }
}

