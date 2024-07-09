import java.util.HashSet;

public class LeetCode_26 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
////        [0,0,1,1,1,2,2,3,3,4]   out: [0,1,2,3,4,_,_,_,_,_]
        for (int i = 0;i<nums.length;i++){
            if(i < nums.length - 1 && nums[i] == nums[i+1]){
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
