package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_55 {
    public static void main(String []args) { // Write a program in Java to convert a decimal number to hexadecimal.
        Scanner in = new Scanner(System.in);
        int dec, q, dn=0, m, l, tmp;
        char s;
        System.out.println("Convert Decimal to Hexadecimal : ");
        System.out.println("Input any Decimal number : ");
        dec = in.nextInt();

        q = dec;
        for(l=q;l>0;l=l/16){
            tmp = l % 16;
            if( tmp < 10)
                tmp =tmp + 48; else
                tmp = tmp + 55;
            dn=dn*100+tmp;
        }
        System.out.print("The equivalent Hexadecimal Number : ");

        for(m=dn;m>0;m=m/100){
            s= (char) (m % 100);
            System.out.print(s);
        }
        System.out.println("");
    }
}

// Convert Decimal to Hexadecimal:
// -------------------------
//Input  any Decimal number: 79
//
//The equivalent Hexadecimal Number : 4F