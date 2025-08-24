import java.util.*;
public class duplicateremovearray {
    public static void main(String[] args){
        int[] arr={1,2,1,2,1,4,5,5,3,4,6,};
        int index=1;
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        int[] newarr = Arrays.copyOf(arr,index);
        System.out.println(Arrays.toString(
                newarr
        ));
    }
}
