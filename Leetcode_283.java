import java.util.Arrays;

public class Leetcode_283 {
    public static void moveZeroes(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            for(int j = 0;j<nums.length-1-i;j++){
                if(nums[j] == 0){ //{0,1,0,3,12}
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
