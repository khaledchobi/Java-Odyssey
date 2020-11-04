package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex_W3_46 { // 46. Write a program in Java to convert a binary number into a decimal number using math function.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        binaryToDecimalMath();
    }
    public static int binaryToDecimalMath(){
        int n1, n, dec=0, i=0, d;
        System.out.println("Convert Binary to Decimal : ");
        System.out.println("Input  the binary number : ");
        n = in.nextInt();
        n1=n;
        while(n!=0){  d = n % 10;
            dec= (int) (dec+d*pow(2,i));
            n=n/10;
            i++;
        }
        System.out.println("The Binary Number : " + n1 + " is the equivalent Decimal Number : " + dec + ".");
        return n;
    }
}

// Convert Binary to Decimal:
// -------------------------
//Input  the binary number :1010100
//
//The Binary Number : 1010100
//The equivalent Decimal  Number is : 84