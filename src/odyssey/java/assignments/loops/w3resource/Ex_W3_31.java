package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_31 {
    public static void main(String []args) { // Write a program in Java to display the pattern like a diamond.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int i, j, r;
        System.out.println("Input number of rows (half of the diamond) : ");
        r = in.nextInt();
        i=0;
        while(i<=r){
            j=1;
            while(j<=r-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
        i=r-1;
        while(i>=1){
            j=1;
            while(j<=r-i) {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=2*i-1) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i--;
        }


        // Using For Loop
        /*int i,j,r;
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
        }*/

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