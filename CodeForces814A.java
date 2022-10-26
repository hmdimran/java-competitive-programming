import java.util.Arrays;
import java.util.Scanner;

public class CodeForces814A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String caseN = "Timur";

        for(int i =0;i<n;i++){
            int o = input.nextInt();
            String str = input.next();
            char[] case1 = caseN.toCharArray();
            char[] case2 = str.toCharArray();
            Arrays.sort(case1);
            Arrays.sort(case2);
            String case3 = new String(case1);
            String case4 = new String(case2);
            if(case3.equals(case4)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
