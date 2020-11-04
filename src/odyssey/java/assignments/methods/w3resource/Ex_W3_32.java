package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_32 { // 32. Write a Java program to determine whether a given number is prime or not.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        primeNumber();
    }
    public static int primeNumber(){
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
        return i;
    }
}

// Input  a number: 13
//13 is a prime number.