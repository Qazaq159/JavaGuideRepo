package com.example.domain;

public class Director extends Manager {
    private double budget;
    public Director(int emdId, String name, String ssn, double salary, String deptName, double budget) {
        super(emdId, name, ssn, salary, deptName);
        this.budget = budget;
    }

    @Override
    public String toString(){
        return super.toString() + "Available budget: " + this.budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
