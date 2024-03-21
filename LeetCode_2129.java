import java.lang.reflect.Array;

public class LeetCode_2129 {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String strArr[] = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() <= 2){
                sb.append(strArr[i] + " ");
            }else{
                char firstCh = strArr[i].charAt(0);
                firstCh = Character.toUpperCase(firstCh);
                String newWord = firstCh + strArr[i].substring(1);
                sb.append(newWord + " ");
            }
        }
        String result = sb.toString();
        return  result.strip();
    }
    public static void main(String[] args) {
        LeetCode_2129 leetCode2129 = new LeetCode_2129();
        String result = leetCode2129.capitalizeTitle("hello Bangla desh");
        System.out.println(result);
    }
}
