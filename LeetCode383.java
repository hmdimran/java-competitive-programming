public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int num = 0;
        char[] alphabets = ransomNote.toCharArray();
        char[] paper = magazine.toCharArray();
        for(int i = 0;i<alphabets.length;i++){
            for(int j = 0;j<paper.length;j++){
                if(alphabets[i] == paper[j]){
                    num++;
                    paper[j] = '0';
                    break;
                }
            }
        }
        if (num == alphabets.length) return true;
        else return false;
    }
}
