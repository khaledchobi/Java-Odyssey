package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_21 { // 21. Write a program in Java to display the sum of the series [ 9 + 99 + 999 + 9999 ...].

    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        sumOfSeries();
    }
    public static int sumOfSeries(){
        int n, i, t=9;
        int sum =0;
        System.out.println("Input the number or terms :");
        n = in.nextInt();
        i=1;
        while(i<=n){
            sum +=t;
            System.out.print(t + "  ");
            t=t*10+9;
            i++;
        }
        System.out.println("\nThe sum of the series =  " + sum);
        return i;
    }
}

// Input the number or terms :5
//9   99   999   9999   99999
//The sum of the series = 111105