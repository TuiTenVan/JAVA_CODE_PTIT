import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ClassThiSinh {
    private String ma;
    private String name;
    private double lythuyet;
    private double thuchanh;
    public ClassThiSinh(String ma, String name, double lythuyet, double thuchanh) {
        this.ma = ma;
        this.name = name;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    public double trungbinh() {
        return (this.thuchanh + this.lythuyet) / 2;
    }
    public String check() {
        double x = this.trungbinh();
        if (x > 9.5) {
            return "XUAT SAC";
        } else if (x >= 8) {
            return "DAT";
        } else if (x >= 5) {
            return "CAN NHAC";
        } else {
            return "TRUOT";
        }
    }
    public String toString() {
        return ma + " " + name + " " + String.format("%.2f", trungbinh()) + " " + check();
    }
}
public class J05013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        List<ClassThiSinh> list = new ArrayList<>();
        for (int j = 0; j < t; j++) {
            String name = sc.nextLine();
            double lythuyet = Double.parseDouble(sc.nextLine());
            if (lythuyet > 10) {
                lythuyet /= 10;
            }
            double thuchanh = Double.parseDouble(sc.nextLine());
            if (thuchanh > 10) {
                thuchanh /= 10;
            }
            list.add(new ClassThiSinh("TS0" + (j + 1), name, lythuyet, thuchanh));
        }
        List<ClassThiSinh> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList, (ts1, ts2) -> Double.compare(ts2.trungbinh(), ts1.trungbinh()));
        for (ClassThiSinh ClassThiSinh : sortedList) {
            System.out.println(ClassThiSinh);
        }
    }
}
