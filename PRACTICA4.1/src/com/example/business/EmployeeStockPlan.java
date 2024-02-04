package com.example.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeStockPlan {

    private final int directorStock = 1000;
    private final int managerStock = 100;
    private final int otherEmployees = 10;
    public int grantStock(Employee emp){
        if (emp instanceof Director){
            return directorStock;
        }else {
            if (emp instanceof Manager){
                return managerStock;
            }else {
                return otherEmployees;
            }
        }
    }
}
