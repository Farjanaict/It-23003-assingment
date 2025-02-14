public class ArraySumCalculator {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Sum: " + calculateSum(numbers));
    }
}
