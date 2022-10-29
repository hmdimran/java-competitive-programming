public class LeetCode_344 {
    public static void reverseString(char[] s) {
        int slength = s.length;
        int size = s.length;
        if(size%2 == 0){
            size = size/2;
        }else{
            size = size/2+1;
        }
        for(int i = 0;i<size;i++){
            char chare = s[i];
            s[i] = s[slength-1-i];
            s[slength-1-i] = chare;
        }
    }
    public static void main(String[] args) {
        char[] car = {'H','a','n','n','a','h'};
        reverseString(car);
    }
}
