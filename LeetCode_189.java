import java.util.Arrays;

public class LeetCode_189 {
//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        reverseIndex(nums,0,n-1);
        reverseIndex(nums,0,k-1);
        reverseIndex(nums,k,n-1);
    }

    public static void reverseIndex(int[] nums,int start,int end){
        while (start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

    }
}
