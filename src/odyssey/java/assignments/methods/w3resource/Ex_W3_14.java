package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_14 { // 14. Write a program in Java to make such a pattern like a pyramid with an asterisk.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {

        pPyramidAsterisk();
    }
    public static int pPyramidAsterisk(){
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
        return i;
    }
}
// Input number of rows  : 4
//       *
//      * *
//     * * *
//    * * * *
