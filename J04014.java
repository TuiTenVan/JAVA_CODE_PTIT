import java.util.*;

class PhanSo{
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
    public J04003 tong(J04003 other){
        long tu = other.a * b + other.b * a;
        long mau = b * other.b;
        long tu1 = tu / gcd(tu, mau);
        long mau1 = mau / gcd(tu, mau);
        return new J04003(tu1 * tu1, mau1 * mau1);
    }

    public J04003 sub(J04003 other) {
        long tu = a * other.a;
        long mau = b * other.b;
        long tu1 = tu / gcd(tu, mau);
        long mau1 = mau / gcd(tu, mau);
        return new J04003(tu1, mau1);
    }
    public String toString() {
        return a + "/" + b;
    }
}
 
public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            J04003 x = new J04003(a, b);
            long c = sc.nextLong();
            long d = sc.nextLong();
            J04003 y = new J04003(c, d);
            J04003 k = x.tong(y);
            J04003 v = x.sub(y).sub(k);
            System.out.println(k + " " + v);
        }
    }
}

