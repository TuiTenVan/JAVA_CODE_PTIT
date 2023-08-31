import java.io.File;
import java.util.List;
import java.util.*;

class SanPham{
    private String ma, ten;
    private int gia, bh;
    public SanPham(String ma, String ten, int gia, int bh) {
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.bh = bh;
    }
    public int getGia() {
        return this.gia;
    }
    public String getMa(){
        return this.ma;
    }
    public String toString() {
        return ma + " " + ten + " " + gia + " " + bh;
    }
}
public class J07048 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        // sc.nextLine();
        List<SanPham> list = new ArrayList<SanPham>();
        while(t-- > 0){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = sc.nextInt();
            int bh = sc.nextInt();
            SanPham s = new SanPham(ma, ten, gia, bh);
            list.add(s);
        }
        list.sort((s1,s2) -> {
            if(s2.getGia() == s1.getGia()){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                return s2.getGia() - s1.getGia();
            }
        });
        for(SanPham s : list) {
            System.out.println(s);
        }
        sc.close();
    }
}
