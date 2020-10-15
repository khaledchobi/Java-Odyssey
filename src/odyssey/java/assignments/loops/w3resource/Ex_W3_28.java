package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_28 {
    public static void main(String []args) { // Write a Java program to find the perfect numbers within a given number of range.
        Scanner in = new Scanner(System.in);
        int n,i,sum;
        int mn,mx;
        System.out.println("Input the starting range or number : ");
        mn = in.nextInt();
        System.out.println("Input the ending range of number : ");
        mx = in.nextInt();
        System.out.print("The Perfect numbers within the given range : ");
        for(n=mn;n<=mx;n++){
            i=1;
            sum = 0;
            while(i<n){
                if(n%i==0)
                    sum=sum+i;
                i++;
            }
            if(sum==n)
                System.out.print(n + " ");
        }
        System.out.println("");
    }
}

// Input the starting range or number : 1
//Input the ending range of number : 50
//The Perfect numbers within the given range : 6 28
/*Perfect number is a positive number which sum of all positive divisors excluding
that number is equal to that number. For example 6 is perfect number since divisor of 6 are 1, 2 and 3.
Sum of its divisor is 1 + 2+ 3 = 6*/