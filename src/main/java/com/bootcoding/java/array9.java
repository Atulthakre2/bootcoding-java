package com.bootcoding.java;

public class array9 {
    public static void main(String[] args) {
        int n[] = {10, 15, 20, 25, 30, 35, 40, 60, 70};
        int max = 0;
       for (int i = 0; i < n.length; i++) {
           if (n[i] > max) {
             max = n[i];
            }
            System.out.println(n[0] + " is the minimum no");
        }
    }
}
