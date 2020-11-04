package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_20 { // 20. Write a program in Java to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.

    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        pyramidOddAsterisk();
    }
    public static int pyramidOddAsterisk(){
        int i, j, n;
        System.out.println("Input number of rows for this pattern :");
        n = in.nextInt();
        int k = 0;

        i = 1;
        while(i <= n){
            j = 1;
            while(j <= n - i) {
                System.out.print("  ");
                ++j;
            }
            k = 0;
            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
            ++i;
        }
        return i;
    }
}
// Input number of rows for this pattern :5
//
//    *
//   ***
//  *****
// *******