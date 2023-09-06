import java.util.*;

public class BangHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long min_a = 10000000;
        long min_b = 10000000;
        while(n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            min_a = Math.min(min_a, a);
            min_b = Math.min(min_b, b);
        }
        long ans = (long)(min_a * min_b);
        System.out.println(ans);
    }
}