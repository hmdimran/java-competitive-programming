import java.util.HashSet;
import java.util.Set;

public class LeetCode_217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniques.add(nums[i]);
        }
        if(nums.length == uniques.size()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
