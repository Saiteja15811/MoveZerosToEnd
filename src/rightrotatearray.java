import java.util.Arrays;

public class rightrotatearray {
    // Function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate array right by k positions
    public static int[] rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Reverse entire array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k-1 );
        // Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5,6,7,8};
        int k = 2;
        System.out.println("Right Rotated Array: " + Arrays.toString(rightRotate(arr, k)));
    }
}
