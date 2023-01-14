package com.bootcoding.java;

import java.util.Scanner;

public class EvenOddProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        int a=10;
        n=a+2+ ++a;
        //<>
        if (n % 2 == 0) {
            System.out.println(n + "is Even numbver");
        } else {
            System.out.println(n + "is Odd number");
        }
    }
}
//Write a program three integer  no from user and print maximum no amopng them

