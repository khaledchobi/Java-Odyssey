package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_14 {
    public static void main(String []args) { // Write a program in Java to make such a pattern like a pyramid with an asterisk.
        Scanner in = new Scanner(System.in);
        // Using While Loop like 1, 2, 3, 4
        int i, j, rows, s, k;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        s = rows + 4 - 1;
        for (i = 1; i <= rows; i++) {
            for (k = s; k != 0; k--) {
                System.out.print(" ");
            }
            j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            s--;
        }


        // Using While Loop like 1, 3, 7
        /*int rows, k = 0;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();
        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1){
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }*/

        // Using For Loop
        /*int i, j, rows, s, k;
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
        }*/
    }
}
// Input number of rows  : 4
//       *
//      * *
//     * * *
//    * * * *
