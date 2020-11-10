package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_34 { // 34. Write a program in Java to find the prime numbers within a range of numbers.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        primeNumbers();
    }
    public static int primeNumbers(){
        int num,i,ctr,start,end;
        System.out.println("Input starting number of range: ");
        start = in.nextInt();
        System.out.println("Input ending number of range : ");
        end = in.nextInt();
        System.out.println("The prime numbers between " + start + " and " + end + " are : ");
        num = start;
        while(num<=end){
            ctr = 0;
            i=2;
            while(i<=num/2){
                if(num%i==0){
                    ctr++;
                    break;
                }
                i++;
            }
            if(ctr==0 && num!= 1)
                System.out.print(num + " ");
            num++;
        }
        System.out.println("\n");
        return num;
    }
}
// Input starting number of range: 1
//Input ending number of range : 50
//The prime numbers between 1 and 50 are :
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47