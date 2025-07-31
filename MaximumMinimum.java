public class MaximumMinimum {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = -5;
        int num3 = 7;

        int max;
        int min;

        // Finding the maximum
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        // Finding the minimum
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}