package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Method_Calculator_01 {
    static Scanner reader = new Scanner(System.in); //global variable
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){

        int choice;
        do {
            System.out.println("Press 1 for Addition.\nPress 2 for Deletion.\nPress 3 for Multiplication.\nPress 4 for Division.\nPress 5 for Exit.");
            System.out.println("Please Enter Your Choice: ");
            choice = reader.nextInt(); // local variable

            switch(choice) {
                case 1: {
                    addition();
                    break;
                }

                case 2: {
                    deletion();
                    break;
                }

                case 3: {
                    multiplication();
                    break;
                }

                case 4: {
                    division();
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

    public static int addition(){

        System.out.println("Welcome to Addition World!!!");

        System.out.println("Please Enter 1st number: ");
        int num1 = reader.nextInt();

        System.out.println("Please Enter 2nd number: ");
        int num2 = reader.nextInt();

        int result = num1 + num2;

        System.out.println("The Addition result is : " + result);
        return result;

    }

    public static int deletion(){
        System.out.println("Welcome to Deletion World!!!");

        System.out.println("Please Enter 1st number: ");
        int num1 = reader.nextInt();

        System.out.println("Please Enter 2nd number: ");
        int num2 = reader.nextInt();

        int result = 0;

        if (num1 > num2){
            result = (num1 - num2);
        }

        else if (num2 > num1){
            result = (num2 - num1);
        }

        System.out.println("The Deletion result is : " + result);

        return result;

    }

    public static int multiplication(){
        System.out.println("Welcome to Multiplication World!!!");

        System.out.println("Please Enter 1st number: ");
        int num1 = reader.nextInt();

        System.out.println("Please Enter 2nd number: ");
        int num2 = reader.nextInt();

        int result = num1 * num2;

        System.out.println("The Multiplication result is : " + result);
        return result;
    }

    public static double division(){
        System.out.println("Welcome to Division World!!!");

        System.out.println("Please Enter 1st number: ");
        double num1 = reader.nextInt();

        System.out.println("Please Enter 2nd number: ");
        int num2 = reader.nextInt();

        double result = num1 / num2;

        System.out.println("The Division result is : " + result);
        return result;
    }
}
