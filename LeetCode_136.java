import java.util.Arrays;

public class LeetCode_136 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] number = {2,2,4,5,2,5};
        System.out.println(singleNumber(number));
    }
}
