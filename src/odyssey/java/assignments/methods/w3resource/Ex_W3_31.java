package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_31 { // 31. Write a program in Java to display the pattern like a diamond.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        patternDiamond();
    }
    public static int patternDiamond(){
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
        return i;
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