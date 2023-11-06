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
    public PhanSo tong(PhanSo other){
        long tu = other.a * b + other.b * a;
        long mau = b * other.b;
        long tu1 = tu / gcd(tu, mau);
        long mau1 = mau / gcd(tu, mau);
        return new PhanSo(tu1 * tu1, mau1 * mau1);
    }

    public PhanSo sub(PhanSo other) {
        long tu = a * other.a;
        long mau = b * other.b;
        long tu1 = tu / gcd(tu, mau);
        long mau1 = mau / gcd(tu, mau);
        return new PhanSo(tu1, mau1);
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
            PhanSo x = new PhanSo(a, b);
            long c = sc.nextLong();
            long d = sc.nextLong();
            PhanSo y = new PhanSo(c, d);
            PhanSo k = x.tong(y);
            PhanSo v = x.sub(y).sub(k);
            System.out.println(k + " " + v);
        }
    }
}

