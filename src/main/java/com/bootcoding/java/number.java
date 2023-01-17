package com.bootcoding.java;

public class number {
    public static void main(String args[]) {
        int num1 = 15;
        int num2 = 17;
        int num3 = 43;
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 +"is the maximum no");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+"is the maximum no");
        else
            System.out.println(num3+"is the maximum no");
    }
}




