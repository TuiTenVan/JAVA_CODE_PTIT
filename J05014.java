import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class GiaoVien {
    private String maGV;
    private String name;
    private String ma;
    private double diemTin;
    private double diemChuyenMon;

    public GiaoVien(String maGV, String name, String ma, double diemTin, double diemChuyenMon) {
        this.maGV = maGV;
        this.name = name;
        this.ma = ma;
        this.diemTin = diemTin;
        this.diemChuyenMon = diemChuyenMon;
    }

    public double UuTien() {
        int x = Integer.parseInt(this.ma.substring(1));
        if (x == 1) {
            return 2.0;
        } else if (x == 2) {
            return 1.5;
        } else if (x == 3) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public double diemTong() {
        return this.diemTin * 2 + this.diemChuyenMon + this.UuTien();
    }

    public String checkMon() {
        char s = this.ma.charAt(0);
        if (s == 'A') {
            return "TOAN";
        } else if (s == 'B') {
            return "LY";
        } else {
            return "HOA";
        }
    }

    public String toString() {
        double x = this.diemTong();
        if (x >= 18) {
            return String.format("%s %s %s %.1f TRUNG TUYEN", this.maGV, this.name, this.checkMon(), this.diemTong());
        } else {
            return String.format("%s %s %s %.1f LOAI", this.maGV, this.name, this.checkMon(), this.diemTong());
        }
    }
}
public class J05014{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        List<GiaoVien> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String ma = sc.nextLine();
            double diemTin = sc.nextDouble();
            double diemChuyenMon = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            list.add(new GiaoVien(String.format("GV%02d", i + 1), name, ma, diemTin, diemChuyenMon));
        }

        List<GiaoVien> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList, (gv1, gv2) -> Double.compare(gv2.diemTong(), gv1.diemTong()));

        for (GiaoVien giaoVien : sortedList) {
            System.out.println(giaoVien);
        }
    }
}
