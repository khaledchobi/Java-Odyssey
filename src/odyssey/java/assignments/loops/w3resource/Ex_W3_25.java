package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_25 {
    public static void main(String []args) { // Write a program in Java to display the n terms of square natural number and their sum.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int i,n,sum=0;
        System.out.println("Input the number of terms : ");
        n = in.nextInt();
        System.out.print("The square natural upto " + n + " terms are : ");
        i=1;
        while(i<=n){
            System.out.print(" " + i*i);
            sum+=i*i;
            i++;
        }
        System.out.println("\nThe Sum of Square Natural Number upto " + n + " terms = " + sum);

        // Using For Loop
        /*int i,n,sum=0;
        System.out.println("Input the number of terms : ");
        n = in.nextInt();
        System.out.print("The square natural upto " + n + " terms are : ");
        for(i=1;i<=n;i++){
            System.out.print(" " + i*i);
            sum+=i*i;
        }
        System.out.println("\nThe Sum of Square Natural Number upto " + n + " terms = " + sum);*/

    }
}

// Input the number of terms : 5
//
//The square natural upto 5 terms are :1  4  9  16  25
//The Sum of Square Natural Number upto 5 terms = 55