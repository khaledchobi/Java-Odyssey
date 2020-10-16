package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_41 {
    public static void main(String []args) { // Write a program in Java to convert a decimal number into binary without using an array.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int n, i, j, bin=0,dn;
        System.out.println("Convert Decimal to Binary: ");
        System.out.println("Enter a number to convert : ");
        n = in.nextInt();

        dn=n;
        i=1;
        j=n;
        while(j>0){
            bin=bin+(n%2)*i;
            i=i*10;
            n=n/2;
            j=j/2;
        }
        System.out.println("The Binary of " + dn + " is " + bin + ".");

        // Using For Loop
        /*int n, i, j, bin=0,dn;
        System.out.println("Convert Decimal to Binary: ");
        System.out.println("Enter a number to convert : ");
        n = in.nextInt();

        dn=n;
        i=1;
        for(j=n;j>0;j=j/2){
            bin=bin+(n%2)*i;
            i=i*10;
            n=n/2;
        }
        System.out.println("The Binary of " + dn + " is " + bin + ".");*/

    }
}
// Convert Decimal to Binary:
// -------------------------
//Enter a number to convert : 25
//
//The Binary of 25 is 11001.
