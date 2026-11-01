package com.ygtech.practice.basics.output.store.readinginput;

import java.util.Scanner;

public class FamilyDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String yourName = sc.next();
        System.out.println("Enter Your Father Name");
        String fatherName = sc.next();
        System.out.println("Enter Your Mother Name");
        String motherName = sc.next();
        System.out.println("Enter Your Sister/Brother Name");
        String siblingName = sc.next();

        System.out.println("Your Name : " + yourName);
        System.out.println("Father Name : " + fatherName);
        System.out.println("Mother Name : " + motherName);
        System.out.println("Sister/Brother Name : " + siblingName);
    }
}
