package com.bootcoding.java;

import java.util.Scanner;

// WAM to get boolean value on whether input number is even or not
public class Boolean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("Given no is even");
        }
        else {
            System.out.println("Given no is not even");
        }

    }
}
