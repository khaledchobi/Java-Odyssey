package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_43 {
    public static void main(String []args) { // Write a Java program to find HCF (Highest Common Factor) of two numbers.
        Scanner in = new Scanner(System.in);
        int i, n1, n2, j, hcf=1;
        System.out.println("HCF of two numbers : ");
        System.out.println("Input 1st number for HCF : ");
        n1 = in.nextInt();
        System.out.println("Input 2nd number for HCF : ");
        n2 = in.nextInt();

        j = (n1<n2) ? n1 : n2;

        for(i=1; i<=j; i++){
            if(n1%i==0 && n2%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF of " + n1 + " and " + n2 + " is : " + hcf + ".");
    }
}

// HCF of two numbers:
// ----------------------
//Input 1st number for HCF: 24
//Input 2nd number for HCF: 28
//
//HCF of 24 and 28 is : 4
