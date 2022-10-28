import java.util.Arrays;

public class Leetcode_2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0;i<heights.length;i++){
            for(int j =0;j<heights.length;j++){
                if(heights[i] > heights[j] && i!= j){
                    int tempheight = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempheight;
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] name = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] height = {17233,32521,14087,42738,46669,65662,43204,8224};
        System.out.println(Arrays.toString(sortPeople(name,height)));
    }
}
