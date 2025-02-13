import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                                       
        
        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Checking each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
           
if (Character.isLetter(ch)) {
                System.out.println(ch + " is a Letter.");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a Digit.");
            } else if (Character.isWhitespace(ch)) {
                System.out.println("' ' is a Whitespace.");
            } else {
                System.out.println(ch + " is a Special Character.");
            }
       
                        
        }
        
        scanner.close();
    }
}

