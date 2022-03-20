package com.iiitd.mc.travelguideapplication;

import java.util.List;

public class Expenses {
    private List<ExpenseRecord> records;

    public Expenses(List<ExpenseRecord> records) {
        this.records = records;
    }

    public List<ExpenseRecord> getRecords() {
        return records;
    }

    public void setRecords(List<ExpenseRecord> records) {
        this.records = records;
    }
}
