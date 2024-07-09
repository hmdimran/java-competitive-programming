import java.util.Arrays;

public class LeetCode_167 {
    public static int[] twoSum(int[] numbers, int target) {
//        for(int i = 0;i<numbers.length-1;i++){
//            for (int j = i+1; j < numbers.length; j++) {
//                if(numbers[i]+numbers[j] == target){
//                    return new int[]{++i,++j};
//                }
//            }
//        }
//         return new int[]{};

        int firstPoint = 0;
        int lastPoint = numbers.length-1;
        while(firstPoint <= lastPoint){
            int toSum = numbers[firstPoint]+numbers[lastPoint];
            if(toSum < target){
                firstPoint++;
            } else if (toSum>target) {
                lastPoint--;
            }else{
                return new int[]{++firstPoint,++lastPoint};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
}
