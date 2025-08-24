import java.util.*;
public class reversearray {
    public static String[] reverse(String[] arr){
        int left=0;
        int right = arr.length-1;
        while(left<right){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args){
        String[] arr={"java","c","c++","javascript","python"};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
