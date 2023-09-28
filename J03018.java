import java.math.BigInteger;
import java.util.Scanner;

public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger ans = computeValue(n);
            System.out.println(ans.mod(new BigInteger("5")));
        }
    }

    public static BigInteger computeValue(int n) {
        BigInteger result = BigInteger.ONE;
        BigInteger base = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            base = base.add(BigInteger.ONE);
            result = result.add(base.pow(n));
        }

        return result;
    }
}
