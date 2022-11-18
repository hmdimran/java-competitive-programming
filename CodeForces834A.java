import java.util.Scanner;

public class CodeForces834A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String check = "YesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYesYes";
        int n = input.nextInt();

        for (int i =0;i<n;i++){
            String str = input.next();
            if(check.contains(str)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
