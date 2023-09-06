import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
             BigInteger x = new BigInteger(sc.nextLine());
             BigInteger y = new BigInteger("11");
             if(x.mod(y).equals(BigInteger.ZERO)){
                System.out.println("1");
             }
             else{
                System.out.println("0");
             }
        }
    
    }
}
