import java.util.Arrays;
import java.util.Scanner;

public class CodeForces1760A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int arr[] = {a,b,c};
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }

    }
}
