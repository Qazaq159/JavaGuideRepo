package com.example.domain;

public class Manager extends Employee {

    private String deptName;

    public Manager(int emdId, String name, String ssn, double salary, String deptName) {
        super(emdId, name, ssn, salary);
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + this.deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
