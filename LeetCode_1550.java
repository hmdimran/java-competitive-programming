public class LeetCode_1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        boolean forword = false;
        int count = 0;
//        [1,2,34,3,4,5,7,23,12]
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 1){
                forword = true;
                count++;
            }else{
                forword = false;
                count = 0;
            }

            if(count == 3){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
