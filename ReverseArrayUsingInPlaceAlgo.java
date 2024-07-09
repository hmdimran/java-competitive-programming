public class ReverseArrayUsingInPlaceAlgo {
    public static int[] reverseArray(int[] arr,int n){
//  [1,2,3,4,5,6] n = 6
        int[] rev = new int[n];
        for (int i = 0; i < arr.length; i++) {
            rev[n-i-1] = arr[i];
        }
        for (int i = 0; i < rev.length; i++) {
            arr[i]  = rev[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] result = reverseArray(arr,6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
