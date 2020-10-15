package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_42 {
    public static void main(String []args) { // Write a program in Java to convert a binary number into a decimal number without using array, function and while loop.
        Scanner in = new Scanner(System.in);
        int n, j, i=1, p=1, d, bin, dn=0;
        System.out.println("Convert Binary to Decimal: ");
        System.out.println("Input a binary number :");
        n = in.nextInt();
        bin=n;
        for (j=n;j>0;j=j/10){
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*2;
            dn=dn+(d*p);
            i++;
        }
        System.out.println("The Binary Number : " + bin + " is the equivalent Decimal Number : " + dn + ".");
    }
}

//   Convert Binary to Decimal:
// -------------------------
//Input a binary number :11001
//
//The Binary Number : 11001
//The equivalent Decimal  Number : 25