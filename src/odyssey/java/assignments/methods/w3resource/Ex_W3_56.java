package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_56 { // 56. Write a program in Java to Check Whether a Number can be Express as Sum of Two Prime Numbers.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        sumPrimeNumbers();
    }
    public static int sumPrimeNumbers(){
        int num,i,j,t1,t2,ctr=0;
        System.out.println("input the number : ");
        num = in.nextInt();

        i=2;
        while(i<=num/2){
            t1=i;
            t2=num-i;

            j=2;
            while(j<=i/2){
                if(i%j==0){ctr++;break;}
                j++;
            }
            if(ctr==0){

                j=2;
                while(j<=(num-i)/2){
                    if((num-i)%j==0){ctr++;break;}
                    j++;
                }
                if(ctr==0)
                    System.out.println(num + " can be written as " + t1 + " + " + t2);
            }
            ctr=0;
            i++;
        }
        return i;
    }
}

// input the number: 16
//16 can be written as 3 + 13.
// 16 can be written as 5 + 11.