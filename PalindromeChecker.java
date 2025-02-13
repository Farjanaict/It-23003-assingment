import java.util.Scanner;

public class PalindromeChecker {
    // Check if a string is a palindrome
    static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase(); // Remove spaces & ignore case
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    // Check if a number is a palindrome
    static boolean isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Checking a string
        System.out.print("Enter a string: ");
        System.out.println(isPalindrome(scanner.nextLine()) ? "Palindrome" : "Not a palindrome");

        // Checking a number
        System.out.print("Enter a number: ");
        System.out.println(isPalindrome(scanner.nextInt()) ? "Palindrome" : "Not a palindrome");

        scanner.close();
    }
}


