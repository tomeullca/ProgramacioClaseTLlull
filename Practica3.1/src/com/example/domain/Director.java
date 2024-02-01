package com.example.domain;

public class Director extends Manager{
    private double budget;
    public Director(int empId, String empName, String empSSN, double salary, double budget, String deptName) {
        super(empId, empName, empSSN, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }
}
