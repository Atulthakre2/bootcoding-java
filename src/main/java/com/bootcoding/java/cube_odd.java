package com.bootcoding.java;

public class cube_odd {
    public static int cubesum(int n)
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
            sum += (2 * i + 1) * (2 * i +1)
                    * (2 * i + 1);

        return sum;
    }


    // Driver function
    public static void main(String args[])
    {
        int a = 5;
        System.out.println(cubesum(a));

    }
}



