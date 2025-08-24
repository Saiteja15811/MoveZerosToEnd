import java.util.Arrays;
public class removeduplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int index=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index]=nums[i];
                index++;
            }
        }
        int[] newarr= Arrays.copyOf(nums,index);
        System.out.println(Arrays.toString(newarr));
        System.out.println(newarr.length);
    }
}