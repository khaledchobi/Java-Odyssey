package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_50 { // 50. Write a program in Java to convert a decimal number into octal without using an array.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        decimalToOctal();
    }
    public static int decimalToOctal(){
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
        return j;
    }
}

// Convert Decimal to Octal:
// -------------------------
//Enter a number to convert : 79
//
//The Octal of 79 is 117.