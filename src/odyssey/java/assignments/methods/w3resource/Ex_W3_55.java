package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_55 { // 55. Write a program in Java to convert a decimal number to hexadecimal.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        decimalToHexadecimal();
    }
    public static int decimalToHexadecimal(){
        int dec, q, dn=0, m, l, tmp;
        char s;
        System.out.println("Convert Decimal to Hexadecimal : ");
        System.out.println("Input any Decimal number : ");
        dec = in.nextInt();
        q = dec;

        l=q;
        while(l>0){
            tmp = l % 16;
            if( tmp < 10)
                tmp =tmp + 48; else
                tmp = tmp + 55;
            dn=dn*100+tmp;
            l=l/16;
        }
        System.out.print("The equivalent Hexadecimal Number : ");

        m=dn;
        while(m>0){
            s= (char) (m % 100);
            System.out.print(s); // System.out.printf("%c",s);
            m=m/100;
        }
        System.out.println("");
        return l;
    }
}

// Convert Decimal to Hexadecimal:
// -------------------------
//Input  any Decimal number: 79
//
//The equivalent Hexadecimal Number : 4F