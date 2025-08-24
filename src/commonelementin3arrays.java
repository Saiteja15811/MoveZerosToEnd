import java.util.*;
public class commonelementin3arrays {
    public static void main(String[] args){
        int[] arr1 ={2,4,8};
        int[] arr2={2,3,4,8,10,16};
        int[] arr3={4,8,14,40};
        ArrayList<Integer> unqlist = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                for(int k=0;k<arr3.length;k++){
                    if(arr1[i]==arr2[j]&& arr1[i]==arr3[k]){
                        unqlist.add(arr1[i]);
                    }
                }
            }
        }
        int[] commonarr= unqlist.stream().mapToInt(Integer:: intValue).toArray();
        System.out.println(Arrays.toString(commonarr));
    }
}
