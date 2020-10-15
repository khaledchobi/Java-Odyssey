package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_26 {
    public static void main(String []args) { // Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
        Scanner in = new Scanner(System.in);
        int n,i;
        long sum=0;
        int t = 1;
        System.out.println("Input the number of terms : ");
        n = in.nextInt();
        for(i=1;i<=n;i++){
            System.out.print(t + " ");
            if (i<n){
                System.out.print("+ ");
            }
            sum=sum+t;
            t=(t*10)+1;
        }
        System.out.println("\nThe Sum is : " + sum);
    }
}

//Input the number of terms : 5
//1 + 11 + 111 + 1111 + 11111
//The Sum is : 12345