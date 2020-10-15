package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_23 {
    public static void main(String []args) { // Write a program in Java to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....].
        Scanner in = new Scanner(System.in);
        float x,sum,rows;
        int i,n;
        System.out.println("Input the value of x : ");
        x = in.nextInt();
        System.out.println("Input number of terms : ");
        n = in.nextInt();
        sum =1; rows = 1;

        for (i=1;i<n;i++){
            rows = rows * x / (float)i;
            sum =sum + rows;
        }
        System.out.println("The sum  is : " + sum);
    }
}

// Input the value of x : 3
//Input number of terms : 5
//
//The sum  is : 16.375000
