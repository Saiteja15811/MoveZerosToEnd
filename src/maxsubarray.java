import java.util.Arrays;
public class maxsubarray {
    public static void findmaxsubarr(int[] arr){
        int maxsofar=arr[0];
        int currentmax=arr[0];
        for(int i = 1;i<arr.length;i++){
            currentmax=Math.max(arr[i],currentmax+arr[i]);
            maxsofar=Math.max(maxsofar,currentmax);

        }
        System.out.println("max subarray:"+maxsofar);
    }public static void main(String[] args){
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        findmaxsubarr(arr);

    }
}
