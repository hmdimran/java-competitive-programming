import java.util.Arrays;
import java.util.Scanner;

public class CodeForces834B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i =0;i<n;i++){
            int foundNumber = input.nextInt();
            int sumOfFoundNumber = input.nextInt();
            int[] elemests = new int[foundNumber];
            for(int j =0;j<foundNumber;j++){
                elemests[j] = input.nextInt();
            }
            int res[] = addPossible(elemests);
            Arrays.sort(elemests);
            if(res[1] == sumOfFoundNumber){
                System.out.println("Yes");
            }else{
                int finalRes = res[1];
                while(finalRes <= sumOfFoundNumber){
                    if (elemests[foundNumber-1] + finalRes == sumOfFoundNumber){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
            }
        }
    }
    public static int[] addPossible(int[] arr){
        Arrays.sort(arr);
        int result[] = new int[2];
        int possible = 0;
        int misSum = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1] - arr[i] == 1){
                continue;
            }else{
                possible++;
                misSum+= arr[i]+(arr[i+1] - arr[i]);
            }
        }
        result[0] = possible;
        result[1] = misSum;
        return result;
    }

}
