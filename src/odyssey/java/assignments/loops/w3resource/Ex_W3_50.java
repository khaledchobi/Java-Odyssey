package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_50 {
    public static void main(String []args) { // Write a program in Java to convert a decimal number into octal without using an array.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int n, i, j, octal=0, dn;
        System.out.println("Convert Decimal to Octal : ");
        System.out.println("Enter a number to convert : ");
        n = in.nextInt();

        dn=n;
        i=1;

        j=n;
        while(j>0){
            octal=octal+(j % 8)*i;
            i=i*10;
            n=n/8;
            j=j/8;
        }
        System.out.println("The Octal of " + dn + " is " + octal + ".");


        // Using For Loop
        /*int n, i, j, octal=0, dn;
        System.out.println("Convert Decimal to Octal : ");
        System.out.println("Enter a number to convert : ");
        n = in.nextInt();

        dn=n;
        i=1;

        for(j=n;j>0;j=j/8){
            octal=octal+(j % 8)*i;
            i=i*10;
            n=n/8;
        }
        System.out.println("The Octal of " + dn + " is " + octal + ".");*/

    }
}

// Convert Decimal to Octal:
// -------------------------
//Enter a number to convert : 79
//
//The Octal of 79 is 117.