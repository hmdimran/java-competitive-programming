import java.util.Arrays;

public class BinarySearch {
    public boolean bSearch(int[] nums , int target){
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums,target);
        if(index <0) return false;
        return true;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr2 = {0,1,2,3,4,5,8,7};
        System.out.println(obj.bSearch(arr2,300));
    }
}
