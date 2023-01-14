package com.bootcoding.java;
import java.util.Scanner;

public class Max_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no");
        int first = sc.nextInt();
        System.out.println("Enter second no");
        int second = sc.nextInt();
        System.out.println("Enter third no");
        int third = sc.nextInt();
        if (first >=second && first >= third)
            System.out.println("Enter first number");
        else if(second >= first && second >= third)
        System.out.println("Enter second number");
        else
        System.out.println("Enter third number");
    }
}




