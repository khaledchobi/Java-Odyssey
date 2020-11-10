package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_11 { // 11. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {

        rTriangleSameNumber();

    }
    public static int rTriangleSameNumber(){
        int i,rows;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        for(i=1; i<=rows; i++){

            int count = 1;
            while(i>=count){
                System.out.print(i + " ");
                count++;
            }
            System.out.println("");
        }
        return i;
    }
}
// Input number of rows : 10
//1
//22
//333
//4444
//55555
//666666
//7777777
//88888888
//999999999
//10101010101010101010