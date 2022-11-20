import java.util.Arrays;

public class LeetCode_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n>0){
            for(int j = 0;j< n;j++){
                if(nums2[j] != 0){
                    nums1[m+j] = nums2[j];
                }
            }
        }
        Arrays.sort(nums1);
    }
}
