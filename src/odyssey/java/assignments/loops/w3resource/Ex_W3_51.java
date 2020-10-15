package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_51 {
    public static void main(String []args) { // Write a program in Java to convert an octal number to a decimal without using an array.
        Scanner in = new Scanner(System.in);
        int n1, n5, p=1, k, ch=1, dec=0, i=1, j, d;

        System.out.println("Convert Octal to Decimal : ");
        System.out.println("Input an octal number (using digit 0 - 7) : ");
        n1 = in.nextInt();
        n5=n1;

        for(;n1>0;n1=n1/10){
            k=n1 % 10;
            if(k>=8){
                ch=0;
            }
        }

        switch(ch){
            case 0 :
                System.out.println("\nThe number is not an octal number. \n\n");
                break;
            case 1:
                n1=n5;
                for (j=n1;j>0;j=j/10){
                    d = j % 10;
                    if(i==1)
                        p=p*1;
                    else
                        p=p*8;

                    dec=dec+(d*p);
                    i++;
                }
                System.out.println("The Octal Number : " + n5 + "." + "\nThe equivalent Decimal Number : " + dec + ".");
                break;
        }
    }
}

// Convert Octal to Decimal:
// -------------------------
//Input an octal number (using digit 0 - 7) :745
//
//The Octal Number : 745
//The equivalent Decimal  Number : 485