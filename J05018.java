import java.util.List;
import java.util.*;

class BangDiem{
    static int i = 1;
    private String ma, name;
    private double tong;
    public BangDiem(String name, double tong) {
        this.ma = "HS" + String.format("%02d", i++);
        this.name = name;
        this.tong = tong;
    }
    public double getTong() {
        return tong;
    }
    public String check(){
        if(tong >= 9){
            return "XUAT SAC";
        }
        else if(tong >= 8){
            return "GIOI";
        }
        else if(tong >= 7){
            return "KHA";
        }
        else if(tong >= 5){
            return "TB";
        }
        else{
            return "YEU";
        }
    }
    public String toString(){
        double x = Math.round(tong * 10) / 10.0;
        return ma + " " + name + " " + String.format("%.1f", x) + " " + check();
    }
}
public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<BangDiem> list = new ArrayList<BangDiem>();
        sc.nextLine();
        while(t-- > 0) {
            String name = sc.nextLine();
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            double tong = 0;
            tong += Double.parseDouble(a[0]) * 2;
            tong += Double.parseDouble(a[1]) * 2;
            for (int i = 2; i < a.length; i++) {
                tong += Double.parseDouble(a[i]);
            }
            tong /= 12; 
            BangDiem b = new BangDiem(name, tong);
            list.add(b);
        }
        list.sort((s1, s2) -> Double.compare(s2.getTong(), s1.getTong()));
        for (BangDiem b : list) {
            System.out.println(b);
        }
    }
}
