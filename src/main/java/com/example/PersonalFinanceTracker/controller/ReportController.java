package com.example.PersonalFinanceTracker.controller;

import com.example.PersonalFinanceTracker.model.Transaction;
import com.example.PersonalFinanceTracker.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class ReportController {

    private final TransactionRepository repository;

    // ✅ Returns ALL transactions in given date range
    @GetMapping("/range")
    public List<Transaction> getTransactionsByDateRange(
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate) {

        return repository.findByDateBetween(startDate, endDate);
    }

    @GetMapping("weekly")
    public List<Transaction> getTransactionWeekly(){
        return repository.findByDateBetween(LocalDate.now().minusDays(7) ,LocalDate.now() );
    }

    @GetMapping("monthly")
    public List<Transaction> getTransactionMonthly(){
        return repository.findByDateBetween(LocalDate.now().minusMonths(1) , LocalDate.now());
    }
}
