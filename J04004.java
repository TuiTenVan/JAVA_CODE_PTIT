import java.util.*;

class TongPhanSo{
    private long a, b, c, d;
    public TongPhanSo(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public long gcd(long x, long y) {
        while( y > 0){
            long r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
    public String toString() {
        long mau = b * d ;
        long tu = a * d + c * b;
        long k = gcd(tu, mau);
        long x = tu / k;
        long y = mau / k;
        return x + "/" + y;
    }
}
public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        TongPhanSo x = new TongPhanSo(a, b, c, d);
        System.out.println(x);
    }
}

