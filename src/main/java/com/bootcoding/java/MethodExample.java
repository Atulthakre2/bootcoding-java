package com.bootcoding.java;

import java.util.Scanner;

public class MethodExample {
    // Method is block pof statement
    // int a=10;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        calculateArmstrong(num);
     //   calculateArmstrong(153);
    //    calculateArmstrong(173);



    }
    public static void  calculateArmstrong(int n){
      //  int =153;
        int temp=n;
        int rem=0;
        int sum=0;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println(n + "is armstrong number!");

        }
        else{
            System.out.println(n + "is not armstrong number!");
        }
    }
}

// write a method to get boollean value on whether input number is even or not
//Ex:boolean isEven(int number){...}
//2)wam to get boolean value on whether input number is odd or not
//Ex:boolean is odd(int number){...}
//3) wam to return max number among three number
//Ex:three parameter to a method,method_name:maxNumber(...)
//4)wam to return min number among three number
//5)wam to return natural number upto given number (No Return)
//6)wam to print all even number till given number (No Return)
//7)wam to print all odd number till given number(No return)
//8)wam to print cube of all even number
//9) odd number
