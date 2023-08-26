public class SumFunction {

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50 };
        int totalSum = sumArray(values);
        System.out.println("Total sum: " + totalSum);
    }
}
