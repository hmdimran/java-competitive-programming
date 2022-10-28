import java.util.Arrays;

public class LeetCode_242 {
    public static boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        if(Arrays.equals(first,second)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
