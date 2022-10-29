package Biweekly_Contest_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_2452 {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> resultList = new ArrayList<>();
        for(int i = 0;i<queries.length;i++){
            for(int j = 0;j<dictionary.length;j++){
                boolean getResult  = checkWord(queries[i], dictionary[j]);
                if(getResult == true){
                    resultList.add(queries[i]);
                    break;
                }
            }
        }
        return resultList;

    }

    public boolean checkWord(String one ,String two){
        char[] chOne = one.toCharArray();
        char[] chTwo = two.toCharArray();
        int result = 0;
        if(Arrays.equals(chOne,chTwo)){
            return true;
        }else{
            for (int i = 0;i<chOne.length;i++){
                if(chTwo[i] != chOne[i]){
                    result++;
                }
            }
            if (result >0 && result < 3){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        String[] one = {"tsl","sri","yyy","rbc","dda","qus","hyb","ilu","ahd"};
        String[] two = {"uyj","bug","dba","xbe","blu","wuo","tsf","tga"};
        Leetcode_2452 obj = new Leetcode_2452();
        System.out.println(obj.twoEditWords(one,two));
    }
}
