package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_53 { // 53. Write a program in Java to convert a binary number to octal.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        binaryToOctal();
    }
    public static int binaryToOctal(){
        int n1, n, p=1, dec=0, i=1, j, d, oct=0;
        System.out.println("Convert Binary to Octal : ");
        System.out.println("Input a binary number : ");
        n = in.nextInt();
        n1=n;

        j=n;
        while(j>0){
            d = j % 10;
            if(i==1)
                p=p*1;
            else
                p=p*2;
            dec=dec+(d*p);
            i++;
            j=j/10;
        }
        i=1;

        j=dec;
        while(j>0){
            oct=oct+(j % 8)*i;
            i=i*10;
            n=n/8;
            j=j/8;
        }
        System.out.println("The Binary Number : " + n1 + "." + "\nThe equivalent Octal Number : " + oct + ".");
        return j;
    }
}

// Convert Binary to Octal:
// -------------------------
//Input a binary number :1001
//
//The Binary Number : 1001
//The equivalent Octal  Number : 11