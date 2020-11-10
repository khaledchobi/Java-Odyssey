package src.odyssey.java.assignments.methods.w3resource;

public class Ex_W3_01 { // 1. Write a program in Java to display the first 10 natural numbers.
    public static void main(String []args) { // Write a program in Java to display the first 10 natural numbers.
        natural_number();
    }

    public static int natural_number(){
        int  i;
        System.out.println("The first 10 natural number is : ");

        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }
        return i;
    }
}

// Expected Output :
//1 2 3 4 5 6 7 8 9 10