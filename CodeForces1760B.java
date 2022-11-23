import java.util.Scanner;
public class CodeForces1760B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            String str = in.next();
            char[] arr = str.toCharArray();
            int temp = (int) 'a';
            for(int j =0;j<num;j++){
                if((int)arr[j] > temp){
                    temp = (int)arr[j];
                }
            }
            System.out.println(temp-97+1);
        }

    }
}
