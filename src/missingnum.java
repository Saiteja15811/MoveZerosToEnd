import java.util.*;
public class missingnum {
    public static void main(String[] args){
        int[] arr ={1,2,3,5,6,7};
        for(int i=1;i< arr.length;i++){
            if(arr[i]!= arr[i-1]+1){
                System.out.println(arr[i-1]+1);
            }
        }
    }

}
