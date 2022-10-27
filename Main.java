import java.util.ArrayList;

public class Main {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            if(nums[i] != val){
                arr.add(nums[i]);
            }
        }
        System.out.println(arr);
        return arr.size();
    }
    public static void main(String[] args) {

    }
}
