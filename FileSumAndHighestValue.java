import java.io.*;
import java.util.*;

public class FileSumAndHighestValue {
    public static void main(String[] args) {
        try {
            // Open the input file for reading numbers
            Scanner scanner = new Scanner(new File("input1.txt"));
            
            int sum = 0;
            int highestValue = Integer.MIN_VALUE;
            
            // Read each number from the file
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;  // Add to sum
                if (num > highestValue) {
                    highestValue = num;  // Update highest value
                }
            }
            scanner.close();  // Close the scanner
            
            // Open the output file to write the results
            PrintWriter writer = new PrintWriter("output1.txt");
            writer.println("Sum: " + sum);
            writer.println("Highest Value: " + highestValue);
            writer.close();  // Close the writer
            
            System.out.println("Results written to output.txt.");
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
