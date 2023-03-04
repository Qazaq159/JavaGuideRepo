package com.example.domain;

import java.text.NumberFormat;

public class Employee {
    private int emdId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int emdId, String name, String ssn, double salary) {
        this.emdId = emdId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
                        "ID: %o\n" +
                        "name: %s\n" +
                        "Social Security Number: %s\n" +
                        "Salary: %s",
                        this.getEmdId(), this.name, this.ssn, NumberFormat.getCurrencyInstance().format(this.salary));
    }

    public int getEmdId() {
        return emdId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name == null || name == "") {
            System.out.println("Name is required! Please write real name");
            return;
        }
        this.name = name;
    }

    public void raiseSalary(double increase) {
        if (increase <= 0) {
            System.out.println("Increase must be positive value");
            return;
        }
        this.salary += increase;
    }
}
