package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_23 { // 23. Write a program in Java to display the sum of the series [ 1+x+x^2/2!+x^3/3!+....].

    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        sumOfSeries();
    }
    public static int sumOfSeries(){
        float x,sum,rows;
        int i,n;
        System.out.println("Input the value of x : ");
        x = in.nextInt();
        System.out.println("Input number of terms : ");
        n = in.nextInt();
        sum =1; rows = 1;

        i=1;
        while(i<n){
            rows = rows * x / (float)i;
            sum =sum + rows;
            i++;
        }
        System.out.println("The sum  is : " + sum);
        return i;
    }
}

// Input the value of x : 3
//Input number of terms : 5
//
//The sum  is : 16.375000
