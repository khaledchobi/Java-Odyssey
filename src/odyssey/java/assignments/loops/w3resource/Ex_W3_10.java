package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_10 {
    public static void main(String []args) { // Write a program in Java to display the pattern like right angle triangle with a number.
        Scanner in = new Scanner(System.in);
        int i,j,rows;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
// Input number of rows : 10
//1
//12
//123
//1234
//12345
//123456
//1234567
//12345678
//123456789
//12345678910
