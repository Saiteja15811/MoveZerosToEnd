import java.util.*;
public class commonelement {
    public static void main(String[] args){
        int[] arr1={1,3,2,4,};
        int[] arr2={5,6,3,7};
        List<Integer> unqlist=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    unqlist.add(arr1[i]);
                }
            }
        }
        int[] newarr= unqlist.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(newarr));
    }
}
