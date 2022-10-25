import java.util.HashMap;

public class Leetcode_13 {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;

        char[] arr = s.toCharArray();

        for(int i = 0;i<=arr.length-1;i++){
            if(i != arr.length - 1){
                if(map.get(arr[i]) < map.get(arr[i+1])){
                    result += map.get(arr[i+1]) - map.get(arr[i]);
                    if(i+1 > arr.length-1){
                        break;
                    }else{
                        i = i +1;
                    }
                }else{
                    result +=map.get(arr[i]);
                }
            }else{
                result +=map.get(arr[i]);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Leetcode_13 obj = new Leetcode_13();

        System.out.println(obj.romanToInt("LVIII"));

    }
}
