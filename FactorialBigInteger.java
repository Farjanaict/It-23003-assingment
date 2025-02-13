import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
    // Method to compute factorial using BigInteger
    static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        BigInteger fact = factorial(number);
        System.out.println("Factorial of " + number + " is:\n" + fact);
        
        scanner.close();
    }
}
