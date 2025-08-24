import java.lang.reflect.Array;
import java.util.Arrays;

public class allzerosToEnd {
    public static void main(String[] args){
        int[] arr={1,0,2,0,3,0,3,0,9};
        int nonindex=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[nonindex]=arr[i];
                nonindex++;
            }
        }
        while(nonindex< arr.length){
            arr[nonindex]=0;
            nonindex++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
