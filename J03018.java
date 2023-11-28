import java.math.BigInteger;
import java.util.Scanner;

public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int k = 0;
            if(n.length() == 1){
                k = Integer.parseInt(n);
            }
            else{
                k = Integer.parseInt(n.substring(n.length() - 2));
            }
            if(k % 4 == 0){
                System.out.println("4");
            }
            else{
                System.out.println("0");
            }
        }
    }

}
