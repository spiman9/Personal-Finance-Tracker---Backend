package com.example.PersonalFinanceTracker.service;

import com.example.PersonalFinanceTracker.model.Transaction;
import com.example.PersonalFinanceTracker.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository repository;

    public Transaction save(Transaction transaction) {

        // ✅ If date is null, set today's date
        if (transaction.getDate() == null) {
            transaction.setDate(LocalDate.now());
        }

        return repository.save(transaction);
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
