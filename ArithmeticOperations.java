
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int p = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int q = scanner.nextInt();

        int sum = p + q;
        int diff = Math.abs(p - q);
        int product = p * q;
        String quotient = (q != 0) ? String.valueOf(p / q) : "Undefined (Division by zero is not allowed)";

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}