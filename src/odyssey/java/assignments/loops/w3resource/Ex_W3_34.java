package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_34 {
    public static void main(String []args) { // Write a program in Java to find the prime numbers within a range of numbers.
        Scanner in = new Scanner(System.in);
        // Using While Loop
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


        // Using For Loop
        /*int num,i,ctr,start,end;
        System.out.println("Input starting number of range: ");
        start = in.nextInt();
        System.out.println("Input ending number of range : ");
        end = in.nextInt();
        System.out.println("The prime numbers between " + start + " and " + end + " are : ");
        for(num = start; num<=end; num++){
            ctr = 0;
            for(i=2;i<=num/2;i++){
                if(num%i==0){
                    ctr++;
                    break;
                }
            }
            if(ctr==0 && num!= 1)
                System.out.print(num + " ");
        }
        System.out.println("\n");*/

    }
}
// Input starting number of range: 1
//Input ending number of range : 50
//The prime numbers between 1 and 50 are :
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47