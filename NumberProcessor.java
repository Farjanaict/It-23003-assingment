import java.io.*;
import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        try (Scanner scanner = new Scanner(new File(inputFile));
             PrintWriter writer = new PrintWriter(new File(outputFile))) {
            
            scanner.useDelimiter(","); // Use comma as a delimiter
            List<Integer> numbers = new ArrayList<>();
            
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            
            List<String> results = new ArrayList<>();
            
            for (int num : numbers) {
                int sum = sumNaturalNumbers(num);
                results.add(String.valueOf(sum)); // Only the sum
            }
            
            // Writing only the sums to the output file in the same format (comma-separated)
            writer.println(String.join(", ", results));
            
            System.out.println("Processing complete. Check output.txt for results.");
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found.");
        }
    }
    
    public static int sumNaturalNumbers(int n) {
        return n * (n + 1) / 2; // Formula for sum of first n natural numbers
    }
}
