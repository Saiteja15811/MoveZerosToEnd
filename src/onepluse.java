import java.util.Arrays;
public class onepluse {
    public static void main(String[] args){
        int[] nums={9};
        int index=nums[nums.length-1];
        nums[nums.length-1]=index+1;
        System.out.println(Arrays.toString(nums));
    }
}
