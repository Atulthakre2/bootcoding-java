package com.bootcoding.java;

import java.util.Scanner;

// WAM to get boolean value on whether input number is even or not
public class boolean_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no");
        int n= sc.nextInt();
        if(n%2==1){
            System.out.println("Given no is odd");
        }
        else {
            System.out.println("Given no is not odd");
        }

    }
}
