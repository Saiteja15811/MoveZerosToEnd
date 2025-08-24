import java.util.*;
public class getarrayindexvalue {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println("enter a number to get its index");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a){
                System.out.println(i);
            }
        }
    }
}
