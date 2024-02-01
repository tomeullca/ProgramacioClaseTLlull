package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setEmpName("Jane Smith");
        emp.setEmpSSN("012_34_4567");
        emp.setSalary(120_345.27);

        Employee emp2 = new Employee();

        emp2.setEmpId(102);
        emp2.setEmpName("Tomeu Llull");
        emp2.setEmpSSN("021_35_6789");
        emp2.setSalary(120_345.27);

        System.out.println("Employee ID = " + emp.getEmpId());
        System.out.println("Employee name = " + emp.getEmpName());
        System.out.println("Employee Social Security Number = " + emp.getEmpSSN());
        System.out.println("Employee salary = " + emp.getEmpSalary());
        System.out.println();
        System.out.println("Employee ID = " + emp2.getEmpId());
        System.out.println("Employee name = " + emp2.getEmpName());
        System.out.println("Employee Social Security Number = " + emp2.getEmpSSN());
        System.out.println("Employee salary = " + emp2.getEmpSalary());

    }
}
