package com.tracker.tracker.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Transaction {
    private String name;
    private double value;
}