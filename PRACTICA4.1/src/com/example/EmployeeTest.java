package com.example;

import com.example.business.EmployeeStockPlan;
import com.example.domain.*;

public class EmployeeTest {
    public static void main(String[] args) {

        Engineer eng = new Engineer(101,"Jane Smith", "012-34-5678", 120_345.27);

        Manager man = new Manager(207,"Barbara Johnson", "054-12-2367",1,"US Marketing");

        Admin adm = new Admin(304,"Bill Monroe", "108-23-6509",75_002.34);

        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36,  1_000_000.00,"Global Marketing");



        eng.raiseSalary(1000);

        man.addEmployee(man);
        man.printStaffDetails();
        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(eng,esp);
        printEmployee(dir, esp);
        printEmployee(man, esp);
        printEmployee(adm, esp);
    }





    public static void printEmployee(Employee emp){
        System.out.println(emp.toString());
        System.out.println("Tipus Employee : " + emp.getClass().getSimpleName());
    }
    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee(emp);
        System.out.println("Opcions de stock: " + esp.grantStock(emp));
        System.out.println("-----------------------------------------");
    }
}


