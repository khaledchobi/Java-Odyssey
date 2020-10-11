package src.odyssey.java.assignments.loops;

public class FizzBuzz_WhileLoop {
    public static void main(String []args) { // Java program to print Fizz Buzz Using While Loop
        int n = 20;
        int i = 1;

        while(i <= n){
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
            i++;
        }
    }
}
