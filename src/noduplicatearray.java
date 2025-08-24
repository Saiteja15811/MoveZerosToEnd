import java.util.Arrays;
public class noduplicatearray {
    public static int array(int[] nums ){
        int uniqueindex =0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]!=nums[uniqueindex]){
                uniqueindex++;
                nums[uniqueindex]=nums[i];
            }
        }return uniqueindex+1;
    }public static void main(String[] args){
        int[] nums={1,1,2,2,3,4,4,5};
        array(nums);
        System.out.println(Arrays.toString(nums));
    }
}
