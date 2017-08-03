package com.tracker.tracker.service;

import java.util.List;
import java.util.Collections;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.tracker.tracker.model.Transaction;

@Service
public class TransactionService {
    @HystrixCommand(fallbackMethod = "defaultTransaction")
    public List<Transaction> getTransaction() {
        return Collections.singletonList(new Transaction("First transaction", 42.42));
    }

    private List<Transaction> defaultTransaction() {
        return Collections.singletonList(new Transaction("First transaction", 42.42));
    }
}