package com.tracker.tracker.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracker.tracker.service.TransactionService;
import com.tracker.tracker.model.Transaction;

@Controller
public class DashboardController {

    @Autowired
    private TransactionService service;

    @RequestMapping(value="/dashboard")
    public String dashboard(final Model model) {
        model.addAttribute("name", "tracker");
        model.addAttribute("greetingWord", "Hello");
        return "com.tracker.ui.dashboard";
    }

    @RequestMapping(value="/transactions")
    public String transaction(final Model model) {
        List<Transaction> transactions = service.getTransaction();
        model.addAttribute("transactions", transactions);
        return "com.tracker.ui.transactions";
    }
}
