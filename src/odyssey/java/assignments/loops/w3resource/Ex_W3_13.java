package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_13 {
    public static void main(String []args) { // Write a program in Java to make such a pattern like a pyramid with numbers increased by 1.
        Scanner in = new Scanner(System.in);

        // Using For Loop
        /*int i, j, rows, s, k, t=1;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();
        s = rows ; // s = rows + 4 - 1;
        for(i=1;i<=rows;i++)
        {
            for(k=s;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(" " + t++);
            }
            System.out.println("");
            s--;
        }*/

        // Using While Loop
        int i, rows, s, k, t=1;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();
        s = rows ; // s = rows + 4 - 1;

        for(i=1; i<=rows; i++){
            for(k=s;k>=1;k--)
            {
                System.out.print(" ");
            }
            int j = 1;
            while(i>=j){
                System.out.print(t++ + " ");
                j++;
            }
            System.out.println(" ");
            s--;
        }


    }
}
// Input number of rows : 4
//       1
//      2 3
//     4 5 6
//    7 8 9 10
