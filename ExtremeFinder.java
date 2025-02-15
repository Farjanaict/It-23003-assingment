
public class ExtremeFinder {
    // Method to find the smallest or largest number based on the input string
    public static int findExtreme(String type, int... numbers) {
        // Check if there are no numbers provided
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided.");
        }

        // Initialize result variable
        int result = numbers[0];

        // Loop through numbers to find the smallest or largest
        for (int num : numbers) {
            if (type.equalsIgnoreCase("smallest")) {
                if (num < result) {
                    result = num;
                }
            } else if (type.equalsIgnoreCase("largest")) {
                if (num > result) {
                    result = num;
                }
            } else {
                throw new IllegalArgumentException("Type must be 'smallest' or 'largest'.");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int x = findExtreme("smallest", 5, 2, 9, 1);
        int y = findExtreme("largest", 8, 3, 10, 4);

        // Print results
        System.out.println("Smallest: " + x); // Output: 1
        System.out.println("Largest: " + y);  // Output: 10
    }
}