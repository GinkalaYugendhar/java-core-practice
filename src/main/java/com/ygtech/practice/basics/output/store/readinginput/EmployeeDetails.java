package com.ygtech.practice.basics.output.store.readinginput;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name");
        String empName = sc.next();
        System.out.println("Enter Employee Id number");
        int empID = sc.nextInt();
        System.out.println("Enter Employee Salary");
        int empSalary = sc.nextInt();
        System.out.println("Enter Employee blood group");
        char empBloodGroup = sc.next().charAt(0);
        System.out.println("Enter Employee workingstatus");
        boolean empWorkingStatus = sc.nextBoolean();

        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID : " + empID);
        System.out.println("Employee Salary : " + empSalary);
        System.out.println("Employee Blood Group : " + empBloodGroup);
        System.out.println("Employee Working Status : " + empWorkingStatus);
    }
}
