package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_15 {
    public static void main(String []args) { // Write a Java program to calculate the factorial of a given number.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int i, f = 1, num;
        System.out.println("Input the number : ");
        num = in.nextInt();

        i=1;
        while(i<=num) {
            f = (f * i);
            i++;
        }
        System.out.println("The Factorial of " + num + " is: " + f);

        // Using For Loop
        /*int i,f=1,num;
        System.out.println("Input the number : ");
        num = in.nextInt();

        for(i=1;i<=num;i++)
            f = f * i;

        System.out.println("The Factorial of " + num + " is: " + f);*/
    }
}

// Test Data :
//Input the number : 5
//Expected Output :
//The Factorial of 5 is: 120
