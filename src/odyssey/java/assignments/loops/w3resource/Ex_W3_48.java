package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_48 {
    public static void main(String []args) { // Write a Java program to find Strong Numbers within a range of numbers.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int i, n, s=0, j, k, end, start, fact;
        System.out.println("Find Strong Numbers within a range of numbers : ");
        // If sum of factorial of digits is equal to original number then it is Strong number.
        System.out.println("Input starting range of number : ");
        start = in.nextInt();
        System.out.println("Input ending range of number : ");
        end = in.nextInt();
        System.out.print("The Strong numbers are : ");

        k=start;
        while(k<=end){
            n=k;
            s=0;

            j=k;
            while(j>0){
                fact = 1;

                i=1;
                while(i<=j % 10){
                    fact = fact * i;
                    i++;
                }
                s = s + fact;
                j=j/10;
            }
            if(s==n)
                System.out.print(" " + n);
            k++;
        }
        System.out.println("");


        // Using For Loop
        /*int i, n, s=0, j, k, end, start, fact;
        System.out.println("Find Strong Numbers within a range of numbers : ");
        // If sum of factorial of digits is equal to original number then it is Strong number.
        System.out.println("Input starting range of number : ");
        start = in.nextInt();
        System.out.println("Input ending range of number : ");
        end = in.nextInt();
        System.out.print("The Strong numbers are : ");

        for(k=start;k<=end;k++){
            n=k;
            s=0;
            for(j=k;j>0;j=j/10){
                fact = 1;
                for(i=1; i<=j % 10; i++){
                    fact = fact * i;
                }
                s = s + fact;
            }
            if(s==n)
                System.out.print(" " + n);
        }
        System.out.println("");*/

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