import java.util.Arrays;

public class LeetCode_33 {
    public int search(int[] nums, int target) {
        int i = 0,j = nums.length -1;
        if(nums[i] == target){
            return i;
        }else if(nums[j] == target){
            return j;
        } else if (nums[i]< target) {
            int index = 1;
            while (index < (nums.length-1)){
                if(nums[index] == target){
                    return index;
                }else{
                    index++;
                }
            }
        }
        else if (nums[i] > target) {
            int index = nums.length-2;
            while (index > 0){
                if(nums[index] == target){
                    return index;
                }else{
                    index--;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode_33 obj = new LeetCode_33();
        int[] arr2 = {1,3,5};
        System.out.println(obj.search(arr2,3));
    }
}
