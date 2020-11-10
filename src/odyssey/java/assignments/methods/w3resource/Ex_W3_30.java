package src.odyssey.java.assignments.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_30 { // 30. Write a Java program to find the Armstrong number for a given range of number.
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) {
        armstrongNumberFind();
    }
    public static int armstrongNumberFind(){
        int num,r,sum,temp;
        int start,end;
        System.out.println("Input starting number of range: ");
        start = in.nextInt();
        System.out.println("Input ending number of range : ");
        end = in.nextInt();

        System.out.print("Armstrong numbers in given range are: ");
        num=start;
        while(num<=end){
            temp=num;
            sum = 0;
            while(temp!=0){
                r=temp % 10;
                temp=temp/10;
                sum=sum+(r*r*r);
            }
            if(sum==num)
                System.out.print(" " + num);
            num++;
        }
        System.out.println("\n");
        return num;
    }
}
// Input starting number of range: 1
//Input ending number of range : 1000
//Armstrong numbers in given range are: 1 153 370 371 407

/*When the sum of the cube of the individual digits of a number
 is equal to that number, the number is called Armstrong number. For example 153.
Sum of its divisor is 13 + 53;+ 33; = 1+125+27 = 153*/