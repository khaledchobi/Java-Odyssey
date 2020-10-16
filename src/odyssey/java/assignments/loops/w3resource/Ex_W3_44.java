package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_44 {
    public static void main(String []args) { // Write a program in Java to find LCM of any two numbers using HCF.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int i, n1, n2, j, hcf=1,lcm;
        System.out.println("LCM of two numbers : ");
        System.out.println("Input 1st number for LCM : ");
        n1 = in.nextInt();
        System.out.println("Input 2nd number for LCM : ");
        n2 = in.nextInt();
        j = (n1<n2) ? n1 : n2;

        i=1;
        while(i<=j){
            if(n1%i==0 && n2%i==0){
                hcf = i;
            }
            i++;
        }
        lcm=(n1*n2)/hcf;  //We know  the multiplication of HCF and LCM is equivalant to the multiplication of these two numbers.
        System.out.println("The LCM of " + n1 + " and " + n2 + " is : " + lcm + ".");


        // Using For Loop
        /*int i, n1, n2, j, hcf=1,lcm;
        System.out.println("LCM of two numbers : ");
        System.out.println("Input 1st number for LCM : ");
        n1 = in.nextInt();
        System.out.println("Input 2nd number for LCM : ");
        n2 = in.nextInt();

        j = (n1<n2) ? n1 : n2;

        for(i=1; i<=j; i++){
            if(n1%i==0 && n2%i==0){
                hcf = i;
            }
        }
        lcm=(n1*n2)/hcf;  //We know  the multiplication of HCF and LCM is equivalant to the multiplication of these two numbers.
        System.out.println("The LCM of " + n1 + " and " + n2 + " is : " + lcm + ".");*/

    }
}

//  LCM of two numbers:
// ----------------------
//Input 1st number for LCM: 15
//Input 2nd number for LCM: 20
//
//The LCM of 15 and 20 is : 60