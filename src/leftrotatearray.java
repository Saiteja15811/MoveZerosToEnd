import java.util.Arrays;

public class leftrotatearray {
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static int[] arrrotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k+1,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int k=2;
        System.out.println(Arrays.toString(arrrotate(arr,k)));
    }
}
