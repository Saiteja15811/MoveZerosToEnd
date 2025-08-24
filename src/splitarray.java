import java.util.*;
public class splitarray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        int splitindex= sc.nextInt();
        int[] firsthalf=Arrays.copyOfRange(arr,0,splitindex);
        int[] secondhalf=Arrays.copyOfRange(arr,splitindex,arr.length);
        System.out.println(Arrays.toString(firsthalf));
        System.out.println(Arrays.toString(secondhalf));
    }
}
