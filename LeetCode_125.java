public class LeetCode_125 {
    public static boolean isPalindrome(String s) {
        String frashString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0,size = frashString.length()-1;
        boolean isTrue = true;
        while (i <= size){
            if(frashString.charAt(i++) != frashString.charAt(size--)){
                isTrue = false;
            }
        }
        return isTrue;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
