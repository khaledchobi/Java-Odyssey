package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_14 {
    public static void main(String []args) { // Write a program in Java to make such a pattern like a pyramid with an asterisk.
        Scanner in = new Scanner(System.in);
        int i, j, rows, s, k;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        s = rows + 4 - 1;
        for (i = 1; i <= rows; i++) {
            for (k = s; k != 0; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            s--;
        }
    }
}
// Input number of rows  : 4
//       *
//      * *
//     * * *
//    * * * *
