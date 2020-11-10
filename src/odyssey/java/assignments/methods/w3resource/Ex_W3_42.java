package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_42 { // 42. Write a program in Java to convert a binary number into a decimal number without using array, function and while loop.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        binaryToDecimal();
    }
    public static int binaryToDecimal(){
        int n, j, i=1, p=1, d, bin, dn=0;
        System.out.println("Convert Binary to Decimal: ");
        System.out.println("Input a binary number :");
        n = in.nextInt();
        bin=n;
        j=n;
        while(j>0){
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*2;

            dn=dn+(d*p);
            i++;
            j=j/10;
        }
        System.out.println("The Binary Number : " + bin + " is the equivalent Decimal Number : " + dn + ".");
        return j;
    }
}

//   Convert Binary to Decimal:
// -------------------------
//Input a binary number :11001
//
//The Binary Number : 11001
//The equivalent Decimal  Number : 25