import java.util.Scanner;

public class TimChuSo {
    public static long mod = (int)1e9 + 7;
    public static double chiaTri(double a, long b){
        if(b == 0){
            return 1;
        }
        double x = chiaTri(a, b / 2);
        x = (x * x) % mod;
        if(b % 2 == 0){
            return x;
        }
        else{
            return (double)(x * a) % mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            double x = 2 + Math.sqrt(3);
            double y = chiaTri(x, n);
            long res = (long)y;
            String ans = Long.toString(res);
            if(ans.length() >= 2){
                String k = ans.substring(ans.length() - 2);
                System.out.println(k);
            }
            else{
                System.out.println(ans);
            }
        }
    }
}
