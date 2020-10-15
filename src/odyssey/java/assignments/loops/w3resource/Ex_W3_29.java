package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_29 {
    public static void main(String []args) { // Write a Java program to check whether a given number is an armstrong number or not.
        Scanner in = new Scanner(System.in);
        int num, r, sum=0, temp;
        System.out.println("Input  a number: ");
        num = in.nextInt();

        for(temp=num;num!=0;num=num/10){
            r=num % 10;
            sum=sum+(r*r*r);
        }
        if(sum==temp)
            System.out.println( temp + " is an Armstrong number.\n");
        else
            System.out.println( temp + " is not an Armstrong number.\n");
    }
}

// Input  a number: 153
//153 is an Armstrong number.

/*When the sum of the cube of the individual digits of a number
 is equal to that number, the number is called Armstrong number. For example 153.
Sum of its divisor is 13 + 53;+ 33; = 1+125+27 = 153*/