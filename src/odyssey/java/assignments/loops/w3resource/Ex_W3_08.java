package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_08 {
    public static void main(String []args) { // Write a program in Java to display the n terms of odd natural number and their sum .
        Scanner in = new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Input number of terms : ");
        n = in.nextInt();
        System.out.println("The odd numbers are : ");

        for(i=1;i<=n;i++){
            System.out.print(2*i-1 + " ");
            sum+=2*i-1;
        }
        System.out.println("\nThe Sum of odd Natural Number upto " + n + " terms : " + sum);
    }
}
// Test Data
//Input number of terms : 10
//Expected Output :
//The odd numbers are :1 3 5 7 9 11 13 15 17 19
//The Sum of odd Natural Number upto 10 terms : 100