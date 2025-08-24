import java.util.*;
public class kthLargestSmallestnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k: ");
        int k= sc.nextInt();
        int[] arr={12,02,33,8476,534,643,763,288,99,170};
        Arrays.sort(arr);
        System.out.println(k+"th largest element is:"+arr[arr.length-k]);
        System.out.println(k+"th smallest element is:"+arr[k-1]);
    }
}
