package com.example.domain;

public class Manager extends Employee {

    private String deptName;

    private Employee[] staff;

    private int employeeCount = 0;
    public Manager(int empId, String empName, String empSSN, double salary, String deptName) {
        super(empId, empName, empSSN, salary);
        this.deptName = deptName;
        staff = new Employee[20];
    }

    public String getDeptName(){
        return deptName;
    }

    public int findEmployee(Employee emp){
        for (int i = 0; i < staff.length; i++) {
            if (emp.equals(staff[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean addEmployee(Employee emp){
        if (findEmployee(emp)==-1){
            staff[employeeCount] = emp;
            employeeCount++;
            return true;
        }else{
            return false;
        }
    }


    public boolean removeEmployee(Employee emp){
        boolean local = false;
        Employee[] copiaArray = new Employee[20];
        int temporaryCounter = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getEmpId() != emp.getEmpId()){
                copiaArray[temporaryCounter] = staff[i];
                temporaryCounter++;
            }else {
                local = false;
            }
        }
        staff = copiaArray;
        employeeCount = temporaryCounter;
        return local;
    }

    public void printStaffDetails(Manager man){
        System.out.println("Manager name is: " + man.getEmpName());
        System.out.println("Manager ID is: " + man.getEmpId());
        System.out.println("Manager SSN is: " + man.getEmpSSN());
        System.out.println("Manager salary is: " + man.getEmpSalary());
    }
    public void printStaffDetails(){
        for (int i = 0; i < this.employeeCount; i++) {
            System.out.println("Manager name is: " + staff[i].getEmpName());
            System.out.println("Manager ID is: " + staff[i].getEmpId());
            System.out.println("Manager SSN is: " + staff[i].getEmpSSN());
            System.out.println("Manager salary is: " + staff[i].getEmpSalary());
            System.out.println("------------------------------------------------");
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartment: " + getDeptName();
    }
}
