public class LeetCode_2108 {
    public String firstPalindrome(String[] words) {
        String result = "";
        for (int i = 0;i<words.length;i++){
            boolean isTrue = isPalindrome(words[i]);
            if(isTrue){
                result = words[i]; break;
            }
        }
        return result;
    }
    public static boolean isPalindrome(String single){
        int i = 0, size = single.length()-1;
        boolean isTrue = true;
        while(i <= size){
            if(single.charAt(i++) != single.charAt(size--)){
                isTrue = false;
            }
        }
        return isTrue;
    }
    public static void main(String[] args) {
        LeetCode_2108 obj = new LeetCode_2108();
        String[] isPalindrome = {"notapalindrome","racecar"};
        System.out.println(obj.firstPalindrome(isPalindrome));;
    }

}
