package com.ygtech.practice.basics.output.store.readinginput;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String yourName = sc.next();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Enter Your Grade");
        char grade = sc.next().charAt(0);
        System.out.println("Enter Your Percentage");
        double percentage = sc.nextDouble();
        System.out.println("Enter Your Active Status");
        boolean status = sc.nextBoolean();

        System.out.println("Student Name : " + yourName);
        System.out.println("Student Age : " + age);
        System.out.println("Student Grade : " + grade);
        System.out.println("Student Percentage : " + percentage);
        System.out.println("Student Active : " + status);
    }
}
