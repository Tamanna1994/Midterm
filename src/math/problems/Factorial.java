package math.problems;


import java.sql.SQLOutput;

public class Factorial {

    int n = 5;

    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
    public static int factorial(int n) {
        if (n ==1) {
            return 1;
        } else {
            return n * factorial( n- 1);
        }
    }
    public static void main(String[] args) {

        int m = 5;
        int result = 1;
        for(int i = m; i>0; i--)
            result *= i;
        System.out.println(factorial( 5));
        System.out.print(result);

        public static int factorialRecursion(int i) {
            return 0;
        }
    }

}
