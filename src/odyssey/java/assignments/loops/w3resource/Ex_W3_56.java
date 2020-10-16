package src.odyssey.java.assignments.loops.w3resource;

import java.util.Scanner;

public class Ex_W3_56 {
    public static void main(String []args) { // Write a program in Java to Check Whether a Number can be Express as Sum of Two Prime Numbers.
        Scanner in = new Scanner(System.in);
        // Using While Loop
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


        // Using For Loop
        /*int num,i,j,t1,t2,ctr=0;
        System.out.println("input the number : ");
        num = in.nextInt();
        for(i=2;i<=num/2;i++){
            t1=i;
            t2=num-i;
            for(j=2;j<=i/2;j++){
                if(i%j==0){ctr++;break;}
            }
            if(ctr==0){
                for(j=2;j<=(num-i)/2;j++){
                    if((num-i)%j==0){ctr++;break;}
                }
                if(ctr==0)
                    System.out.println(num + " can be written as " + t1 + " + " + t2);
            }
            ctr=0;
        }*/

    }
}

// input the number: 16
//16 can be written as 3 + 13.
// 16 can be written as 5 + 11.