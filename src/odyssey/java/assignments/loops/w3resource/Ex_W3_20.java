package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_20 {
    public static void main(String []args) { // Write a program in Java to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.println("Input number of rows for this pattern :");
        n = in.nextInt();

        int k = 0;
        for( i = 1; i <= n; ++i, k = 0){
            for( j = 1; j <= n - i; ++j) {
                System.out.print("  ");
                }

                while(k != 2 * i - 1) {
                    System.out.print("* ");
                    ++k;
                }
                System.out.println();
            }
    }
}
// Input number of rows for this pattern :5
//
//    *
//   ***
//  *****
// *******