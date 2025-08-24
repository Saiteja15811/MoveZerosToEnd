import java.util.*;

public class averageexcudelargesmall {
    public static void main(String[] args) {
        int[] arr = {1, 2, 22, 33, 45, 11, 66, 3, 7, 10}; // Example array
        int larg = arr[0];
        int small = arr[0];
        int sum = 0;

        // Find the largest and smallest numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        // Calculate the sum excluding the largest and smallest numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != larg && arr[i] != small) {
                sum += arr[i];
            }
        }

        System.out.println("Largest number is: " + larg);
        System.out.println("Smallest number is: " + small);

        // Calculate the average excluding the largest and smallest
        int count = arr.length - 2; // Exclude largest and smallest
        float avg = (float) sum / count; // Cast to float for correct division
        System.out.println("Average excluding smallest and largest is: " + avg);
    }
}
