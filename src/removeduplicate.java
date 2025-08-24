import java.util.Arrays;
import java.util.HashSet;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,5,5,6,6};
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int k= hs.size();
        Integer[] arr1 = hs.toArray(new Integer[k]);
        System.out.println(Arrays.toString(arr1));

    }
}
