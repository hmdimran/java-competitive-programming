import java.util.Arrays;

public class BinarySearch {
    public int bSearch(int[] arr , int target){
        Arrays.sort(arr);
        int start,end,mid;
        start = 0;
        end = arr.length;
        while(start <= end){
            mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                end = mid-1;
            }else{
                end = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(obj.bSearch(arr2,4));
    }
}
