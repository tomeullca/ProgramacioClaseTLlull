package com.example.domain;

public class Employee {

    public int empId;

    public String empName;

    public String empSSN;

    public double salary;

    public Employee(){

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getEmpSSN() {
        return empSSN;
    }

    public void setEmpSSN(String empSSN) {
        this.empSSN = empSSN;
    }

    public double getEmpSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
