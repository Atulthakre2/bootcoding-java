package com.bootcoding.java;

public class Evenarray6 {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        Evenarray(a);
    }
    public static void Evenarray(int b[]){
        for(int i=0;i<b.length;i++){
            if(b[i]%2==0){
                System.out.println(b[i]);
            }
        }

    }
}
