package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_22 {
    public static void main(String []args) { // Write a program in Java to print the Floyd's Triangle.
        Scanner in = new Scanner(System.in);
        int i,j,n,p,q;
        System.out.println("Input number of rows : ");
        n = in.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0)
            { p=1;q=0;}
            else
            { p=0;q=1;}
            for(j=1;j<=i;j++)
                if(j%2==0)
                    System.out.print(p + " ");
                else
                    System.out.print(q + " ");
            System.out.println("");
        }
    }
}
// Input number of rows : 5
//1
//01
//101
//0101
//10101
