package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_32 {
    public static void main(String []args) { // Write a Java program to determine whether a given number is prime or not.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int num,i,ctr=0;
        System.out.println("Input  a number: ");
        num = in.nextInt();
        i=2;
        while(i<=num/2){
            if(num % i==0){
                ctr++;
                break;
            }
            i++;
        }
        if(ctr==0 && num!= 1)
            System.out.println(num + " is a prime number.\n");
        else
            System.out.println(num + " is not a prime number.");


        // Using For Loop
        /*int num,i,ctr=0;
        System.out.println("Input  a number: ");
        num = in.nextInt();
        for(i=2;i<=num/2;i++){
            if(num % i==0){
                ctr++;
                break;
            }
        }
        if(ctr==0 && num!= 1)
            System.out.println(num + " is a prime number.\n");
        else
            System.out.println(num + " is not a prime number.");*/

    }
}

// Input  a number: 13
//13 is a prime number.