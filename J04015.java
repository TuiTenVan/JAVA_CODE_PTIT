import java.util.Scanner;

class ThuNhap {
    private String ma, name;
    private long fee;
    public ThuNhap(String ma, String name, long fee) {
        this.ma = ma;
        this.name = name;
        this.fee = fee;
    }
    public String toString() {
        long luong = 0;
        long k = 0;
        if(ma.charAt(1) == 'T'){
            k = 2000000;
        }
        else if(ma.charAt(1) == 'P'){
            k = 900000;
        }
        else{
            k = 500000;
        }
        String x = ma.substring(2);
        luong = Integer.parseInt(x) * fee + k;
        return ma + " " + name + " " + Integer.parseInt(x)  + " " + k + " " + luong;
    }
}
public class J04015{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        long fee = sc.nextLong();
        ThuNhap t = new ThuNhap(ma, name, fee);
        System.out.println(t);
    }
}
