import java.util.*;

public class unionoftwoarrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5};
        HashSet<Integer> st = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            st.add(arr2[j]);
        }
       List<Integer> union = new ArrayList<>();
        for( int i:st){
            union.add(i);
        }
        System.out.println(union);
}}