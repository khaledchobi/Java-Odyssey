package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex_W3_59 { // 59. Write a program in Java to check Armstrong number of n digits.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        armstrongNumber();
    }
    public static int armstrongNumber(){
        int n1, onum, r, result = 0, n = 0 ;
        System.out.println("Check whether an n digits number is armstrong or not : ");
        System.out.println("Input  an integer : ");
        n1 = in.nextInt();

        onum = n1;
        while (onum != 0){
            ++n;
            onum /= 10;
        }

        onum = n1;
        while (onum != 0){
            r = onum % 10;
            result += pow(r, n);
            onum /= 10;
        }

        if(result == n1)
            System.out.println(n1 + " is an Armstrong number.");
        else
            System.out.println(n1 + " is not an Armstrong number.");
        return onum;
    }
}

// Check whether an n digits number is Armstrong or not :
//-----------------------------------------------------------
// Input  an integer : 1634
// 1634 is an Armstrong number.