package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_36 {
    public static void main(String []args) { // Write a program in Java to display the such a pattern for n number of rows using a number which will start with the number 1 and the first and a last number of each row will be 1.
        Scanner in = new Scanner(System.in);
        // Using While Loop
        int i,j,n;
        System.out.println("Input number of rows : ");
        n = in.nextInt();
        i=0;
        while(i<=n){
            // print blank spaces
            j=1;
            while(j<=n-i) {
                System.out.print(" ");
                j++;
            }
            // Display number in ascending order upto middle
            j=1;
            while(j<=i) {
                System.out.print(j);
                j++;
            }
            // Display  number in reverse order after middle
            j=i-1;
            while(j>=1) {
                System.out.print(j);
                j--;
            }
            System.out.println("");
            i++;
        }

        // Using For Loop
        /*int i,j,n;
        System.out.println("Input number of rows : ");
        n = in.nextInt();
        for(i=0;i<=n;i++){
            // print blank spaces
            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            // Display number in ascending order upto middle
            for(j=1;j<=i;j++)
                System.out.print(j);

            // Display  number in reverse order after middle
            for(j=i-1;j>=1;j--)
                System.out.print(j);

            System.out.println("");
        }*/
    }
}

// Input number of rows : 5
//
//    1
//   121
//  12321
// 1234321
//123454321
