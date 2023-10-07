import java.util.List;
import java.util.*;

class DoanhNghiep{
    private String ma, ten;
    private int soLuong;
    public DoanhNghiep(String ma, String ten, int soLuong){
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
    }
    public String getMa() {
        return ma;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public String toString(){
        return ma + " " + ten + " " + soLuong;
    }
}
public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<DoanhNghiep> list = new ArrayList<DoanhNghiep>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            list.add(new DoanhNghiep(ma, ten, soLuong));
        }
        list.sort((s1, s2) -> {
            if(s1.getSoLuong() == s2.getSoLuong()) return s1.getMa().compareTo(s2.getMa());
            return s2.getSoLuong() - s1.getSoLuong();
        });
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep d : list) {
                int x = d.getSoLuong();
                if(x >= a && x <= b) {
                    System.out.println(d);
                }
            }
        }
        
    }
}
