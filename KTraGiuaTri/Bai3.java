package KTraGiuaTri;
import java.io.File;
import java.util.*;

class SanPham{
    private String ma, ten;
    private int gia, baohanh;
    public SanPham(String ma, String ten, int gia, int baohanh){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baohanh = baohanh;
    }
    public String getMa(){
        return ma;
    }
    public int getGia(){
        return gia;
    }
    public String toString(){
        return ma + " " + ten + " " + gia + " " + baohanh;
    }
}
public class Bai3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SanPham> list = new ArrayList<SanPham>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int baohanh = Integer.parseInt(sc.nextLine());
            SanPham s = new SanPham(ma, ten, gia, baohanh);
            list.add(s);
        }
        list.sort((s1,s2) -> {
            if(s1.getGia() == s2.getGia()){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                return s2.getGia() - s1.getGia();
            }
        });
        for(SanPham s : list){
            System.out.println(s);
        }
    }
}
