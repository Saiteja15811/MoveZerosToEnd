import java.util.Arrays;

public class LEFTROTATE {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 1;
        while (k > 0) {
            int index = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
            k--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
