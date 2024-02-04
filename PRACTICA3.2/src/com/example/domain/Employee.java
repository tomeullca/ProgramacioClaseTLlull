package com.example.domain;

import java.sql.Array;

public class Employee {

    private int empId;

    private String empName;

    private String empSSN;

    private double salary;


    public Employee(int empId, String empName, String empSSN, double salary){
        this.empName = empName;
        this.empId = empId;
        this.empSSN = empSSN;
        if (salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Error de salario para " + getEmpName() + ", use el metodo increaseSalary cuando lo tenga claro y añadele el sueldo");
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
        }
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


    public String getEmpSSN() {
        return empSSN;
    }


    public double getEmpSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        salary+= increase;
    }

}
