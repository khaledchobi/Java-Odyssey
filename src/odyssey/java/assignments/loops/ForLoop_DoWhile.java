package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class ForLoop_DoWhile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int choice;
        do {
            System.out.println("Press 1 for Addition.\nPress 2 for Deletion.\nPress 3 for Multiplication.\nPress 4 for Division.\nPress 5 for Exit.");
            System.out.println("Please Enter Your Choice: ");
            choice = reader.nextInt();

            switch(choice) {
                case 1:
                {

                    System.out.println("Welcome to Addition World!!!");

                    System.out.println("Please Enter 1st number: ");
                    int num1 = reader.nextInt();

                    System.out.println("Please Enter 2nd number: ");
                    int num2 = reader.nextInt();

                    int result = num1 + num2;

                    System.out.println("The Addition result is : " + result);

                    break;

                }

                case 2:
                {
                    System.out.println("Welcome to Deletion World!!!");

                    System.out.println("Please Enter 1st number: ");
                    int num1 = reader.nextInt();

                    System.out.println("Please Enter 2nd number: ");
                    int num2 = reader.nextInt();

                    int result1 = (num1 - num2);

                    int result2 = (num2 - num1);

                    if (num1 > num2){
                        System.out.println("The Deletion result is : " + result1);
                    }
                    else if (num2 > num1){
                        System.out.println("The Deletion result is : " + result2);
                    }

                    break;

                }

                case 3: {
                    System.out.println("Welcome to Multiplication World!!!");

                    System.out.println("Please Enter 1st number: ");
                    int num1 = reader.nextInt();

                    System.out.println("Please Enter 2nd number: ");
                    int num2 = reader.nextInt();

                    int result = num1 * num2;

                    System.out.println("The Multiplication result is : " + result);

                    break;

                }

                case 4: {
                    System.out.println("Welcome to Division World!!!");

                    System.out.println("Please Enter 1st number: ");
                    double num1 = reader.nextInt();

                    System.out.println("Please Enter 2nd number: ");
                    int num2 = reader.nextInt();

                    double result = num1 / num2;

                    System.out.println("The Division result is : " + result);

                    break;

                }


                case 5:
                    System.out.println("Thank You for using the app!!!");
                    System.exit(0);

                default:
                    System.out.println("Wrong Choice. Try Again");

            }

        } while (choice != 5);
    }


}
