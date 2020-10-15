package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_53 {
    public static void main(String []args) { // Write a program in Java to convert a binary number to octal.
        Scanner in = new Scanner(System.in);
        int n1, n,p=1;
        int dec=0,i=1,j,d;
        int oct=0,dn;

        System.out.println("Convert Binary to Octal : ");
        System.out.println("Input a binary number : ");
        n = in.nextInt();
        n1=n;
        for (j=n;j>0;j=j/10){
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*2;
            dec=dec+(d*p);
            i++;
        }
        dn=dec;
        i=1;

        for(j=dec;j>0;j=j/8){
            oct=oct+(j % 8)*i;
            i=i*10;
            n=n/8;
        }
        System.out.println("The Binary Number : " + n1 + "." + "\nThe equivalent Octal Number : " + oct + ".");
    }
}

// Convert Binary to Octal:
// -------------------------
//Input a binary number :1001
//
//The Binary Number : 1001
//The equivalent Octal  Number : 11