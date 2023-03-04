package com.example.domain;

public class Engineer extends Employee {
    public Engineer(String ssn, String name, double salary, int empId){
        super(empId, name, ssn, salary);
    }
}
