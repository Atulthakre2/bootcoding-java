package com.bootcoding.java;

public class cube_even {
    public static int cubesum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += (2 * i) * (2 * i)
                    * (2 * i);

        return sum;
    }


    // Driver function
    public static void main(String args[])
    {
        int a = 8;
        System.out.println(cubesum(a));

    }
}


