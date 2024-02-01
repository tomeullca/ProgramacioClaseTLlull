package com.example.domain;

public class Manager extends Employee {

    private String deptName;
    public Manager(int empId, String empName, String empSSN, double salary, String deptName) {
        super(empId, empName, empSSN, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }
}
