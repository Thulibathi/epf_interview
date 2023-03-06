package org.epftechhub.pojo;

import java.util.Date;

public class Statement {

    private Date months;
    private double income;
    private double expenses;

    public Statement() {
    }

    public Date getMonths() {
        return months;
    }

    public void setMonths(Date months) {
        this.months = months;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
}
