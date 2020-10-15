package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_31 {
    public static void main(String []args) { // Write a program in Java to display the pattern like a diamond.
        Scanner in = new Scanner(System.in);
        int i,j,r;
        System.out.println("Input number of rows (half of the diamond) : ");
        r = in.nextInt();
        for(i=0;i<=r;i++){
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println("");
        }

        for(i=r-1;i>=1;i--){
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}

// Input number of rows (half of the diamond) :5
//
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *