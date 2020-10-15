package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_54 {
    public static void main(String []args) { // Write a program in Java to convert an octal number into binary.
        Scanner in = new Scanner(System.in);
        int n1, n5, p=1, dec=0, i=1, j, d, bin=0;

        System.out.println("Convert Octal to Binary : ");
        System.out.println("Input an octal number (using digit 0 - 7) : ");
        n1 = in.nextInt();

        n5=n1;
        for (j=n1;j>0;j=j/10){
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*8;

            dec=dec+(d*p);
            i++;
        }

        i=1;
        for(j=dec;j>0;j=j/2){
            bin=bin+(dec % 2)*i;
            i=i*10;
            dec=dec/2;
        }
        System.out.println("The Octal Number : " + n5 + "." + "\nThe equivalent Binary Number : " + bin + ".");
    }
}

// Convert Octal to Binary:
// -------------------------
//Input an octal number (using digit 0 - 7) :57
//
//The Octal Number : 57
//The equivalent Binary  Number : 101111