import java.util.*;

public class J01013 {
    static int[] d = new int[2000001];
    public static void sholve() {
        for (int i = 2; i <= 2000000; i++) {
            d[i] = 1;
        }

        for (int p = 2; p * p <= 2000000; p++) {
            if (d[p] == 1) {
                for (int i = p * p; i <= 2000000; i += p) {
                    d[i] = p;
                }
            }
        }
        for(int i = 2; i <= 2000000; i++) {
            if(d[i] == 1) {
                d[i] = i;
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sholve();
        long sum = 0L;
        int n = sc.nextInt();
        while(n-- > 0) {
            int x = sc.nextInt();
            while(x > 1){
                sum += d[x];
                x /= d[x];
            }
        }
        System.out.println(sum);
    }
}
