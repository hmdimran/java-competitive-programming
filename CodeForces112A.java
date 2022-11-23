import java.util.Scanner;

public class CodeForces112A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String one = in.next();
        String two = in.next();
        int a=0,b = 0;
        for (int i = 0;i<one.length();i++){
            a += (int) one.toLowerCase().charAt(i);
            b += (int) two.toLowerCase().charAt(i);
        }

        if(a < b){
            System.out.println(-1);
        } else if (b<a) {
            System.out.println(1);
        }
        else System.out.println(0);

    }
}
