package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_27 {
    public static void main(String []args) { // Write a Java program to check whether a given number is a perfect number or not.
        Scanner in = new Scanner(System.in);
        int n,i,sum;
        System.out.println("Input the  number : ");
        n = in.nextInt();
        sum = 0;
        System.out.print("The positive divisor  : ");
        for (i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
                System.out.print(" " + i);
            }
        }
        System.out.print("\nThe sum of the divisor is : " + sum);

        if(sum==n)
            System.out.println("\nSo, the number is perfect.");
        else
            System.out.println("\nSo, the number is not perfect.");
        System.out.println("");

    }
}
// Input the  number : 56
//The positive divisor  : 1  2  4  7  8  14  28
//The sum of the divisor is : 64
//So, the number is not perfect.
/*Perfect number is a positive number which sum of all positive divisors excluding that number is equal to that number. For example 6 is perfect number since divisor of 6 are 1, 2 and 3.  Sum of its divisor is 1 + 2+ 3 = 6*/