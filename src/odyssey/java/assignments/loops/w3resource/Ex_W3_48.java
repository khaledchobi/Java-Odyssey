package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_48 {
    public static void main(String []args) { // Write a Java program to find Strong Numbers within a range of numbers.
        Scanner in = new Scanner(System.in);
        int i, n1, s1, j, k, end, start;
        int fact;
        System.out.println("Find Strong Numbers within a range of numbers : ");
        /* If sum of factorial of digits is equal to original number then it is Strong number */
        System.out.println("Input starting range of number : ");
        start = in.nextInt();
        System.out.println("Input ending range of number : ");
        end = in.nextInt();
        System.out.print("The Strong numbers are : ");

        for(k=start;k<=end;k++){
            n1=k;
            s1=0;

            for(j=k;j>0;j=j/10){
                fact = 1;

                for(i=1; i<=j % 10; i++){
                    fact = fact * i;
                }
                s1 = s1 + fact;
            }
            if(s1==n1)
                System.out.print(" " + n1);
        }
        System.out.println("");
    }
}

//  Find Strong Numbers within an range of numbers:
// ------------------------------------------------------
//Input starting range of number : 1
//Input ending range of number: 200
//
//
//The Strong numbers are :
//1  2  145