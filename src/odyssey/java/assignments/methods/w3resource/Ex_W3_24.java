package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex_W3_24 { // 24. Write a program in Java to find the sum of the series [ x - x^3 + x^5 + ......].
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        sumOfSeries();
    }
    public static void sumOfSeries(){
        int x,sum,ctr;
        int i,n,m,mm,nn;
        System.out.println("Input the value of x :");
        x = in.nextInt();
        System.out.println("Input number of terms : ");
        n = in.nextInt();
        sum =x; m=-1;
        System.out.println("The values of the series: \n");
        System.out.println(x + "");

        i=1;
        while(i < n){
            ctr = (2 * i + 1);
            mm = (int) pow (x, ctr);
            nn = mm * m;
            System.out.println(nn + " ");
            sum = sum + nn;
            m = m * (-1);
            i++;
        }
        System.out.println("\nThe sum = " + sum);
    }
}
// Input the value of x :2
//Input number of terms : 5
//The values of the series:
//2
//-8
//32
//-128
//512
//
//The sum = 410
