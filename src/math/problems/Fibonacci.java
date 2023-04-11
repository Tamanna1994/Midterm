package math.problems;
import org.junit.Assert;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int n1=0, n2=1,sum=0;

        Scanner sc = new Scanner(System.in);
        int fib;
        System.out.println("how many fibonacci do you want?");

        fib= sc.nextInt();
        for(int i=2;i<fib;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
        int expectedNum=40;
        Assert.assertEquals(expectedNum,fib);
    }
}