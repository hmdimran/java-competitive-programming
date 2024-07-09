public class LeetCode_9 {
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int loopTime = (number.length()-1)/2;
        for (int i = 0 ;i<=loopTime;i++){
            if(number.charAt(i) != number.charAt(number.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean result = isPalindrome(10);
        System.out.println(result);
    }
}
