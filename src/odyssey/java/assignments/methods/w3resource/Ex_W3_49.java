package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_49 { // 49. Write a Java program to find out the sum of an A.P. series.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        sumA_P_Series();
    }
    public static int sumA_P_Series(){
        int n1, df, n2, i, ln, s=0;
        System.out.println("Find out the sum of A.P. series : ");
        System.out.println("Input  the starting number of the A.P. series : ");
        n1 = in.nextInt();
        System.out.println("Input the number of items for  the A.P. series : ");
        n2 = in.nextInt();
        System.out.println("Input  the common difference of A.P. series : ");
        df = in.nextInt();

        s = ( n2 * ( 2 * n1 + ( n2 -1 ) * df ) )/ 2;
        ln = n1 + (n2-1) * df;
        System.out.println("\nThe Sum of the  A.P. series are : ");

        i=n1;
        while(i<=ln){
            if (i != ln)
                System.out.print(i + " + "); // System.out.printf("%d + ", i);
            else
                System.out.println(i + " = " + s);
            i= i + df;
        }
        return i;
    }
}

// Find out the sum of A.P. series :
// ----------------------------------------
//Input  the starting number of the A.P. series: 1
//Input the number of items for  the A.P. series: 10
//Input  the common difference of A.P. series: 4
//
//The Sum of the  A.P. series are :
//1 + 5 + 9 + 13 + 17 + 21 + 25 + 29 + 33 + 37 = 190