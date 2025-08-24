import java.util.Arrays;

public class RIGHTROTATE {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        while(k>0) {
            int index = arr.length - 1;
            for (int i = arr.length - 2; i >= 0; i--) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index--;
            }
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
