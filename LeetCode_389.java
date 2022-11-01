import java.util.Arrays;

public class LeetCode_389 {
    public static char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        char[] result = new char[1];

        for(int i =0;i<arr2.length;i++){
            if(i < arr.length){
                if(arr[i] != arr2[i]){
                    result[0] = arr2[i];
                    break;
                }
            }else{
                result[0] = arr2[i];
            }
        }
        return result[0];
    }
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(findTheDifference(s,t));
    }
}
