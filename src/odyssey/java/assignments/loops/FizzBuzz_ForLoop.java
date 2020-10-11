package src.odyssey.java.assignments.loops;

public class FizzBuzz_ForLoop {
    public static void main(String []args) { // Java program to print Fizz Buzz Using For Loop..
        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }
}
