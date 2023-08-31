import java.util.*;

public class PhanSo {
    private long a, b;
    public PhanSo(long a, long b) {
        this.a = a;
        this.b = b;
    }
    public long gcd(long a, long b) {
        while( b > 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public String toString() {
        long x = a / gcd(a, b);
        long y = b / gcd(a, b);
        return x + "/" + y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo x = new PhanSo(a, b);
        System.out.println(x);
    }
}
