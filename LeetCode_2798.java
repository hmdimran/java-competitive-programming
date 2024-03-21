public class LeetCode_2798 {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for (int i = 0; i < hours.length; i++) {
            if(hours[i] >= target){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] hours = {5,1,4,2,2};
        int result = numberOfEmployeesWhoMetTarget(hours,6);
        System.out.println(result);
    }
}
