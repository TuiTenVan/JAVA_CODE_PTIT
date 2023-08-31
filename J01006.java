import java.util.*;

public class J01006 {
    public static long fibo(long n){
        long[] f = new long[(int) 1000];
        if(n == 1 || n == 2) return 1;
        f[0] = 1;
        f[1] = 1;
        int cnt = 2;
        for(int i = 2; i < 93; i++){
            f[i] = f[i - 1] + f[i - 2];
            cnt++;
            if(cnt == n){
                return f[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(fibo(n));
        }
    }
}
