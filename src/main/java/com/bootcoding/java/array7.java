package com.bootcoding.java;

public class array7 {
    public static void main(String[] args) {
        int n[] = {10, 15, 20, 25, 30, 35, 80, 90,100,75};
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 30 && n[i] <= 100) {
                System.out.println(n[i]);

            }

        }
    }
}
