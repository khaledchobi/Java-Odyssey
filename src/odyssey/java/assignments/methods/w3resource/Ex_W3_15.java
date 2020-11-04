package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_15 { // 15. Write a Java program to calculate the factorial of a given number.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        calculateFactorial();
    }
    public static int calculateFactorial(){
        int i, f = 1, num;
        System.out.println("Input the number : ");
        num = in.nextInt();
        i=1;
        while(i<=num) {
            f = (f * i);
            i++;
        }
        System.out.println("The Factorial of " + num + " is: " + f);
        return i;
    }
}

// Test Data :
//Input the number : 5
//Expected Output :
//The Factorial of 5 is: 120
