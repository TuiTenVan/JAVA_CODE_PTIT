package ThucHanh_OOP_buoi_01;

import java.util.*;

class DonHang{
    private String ten, ma;
    private int gia, soluong;
    public DonHang(String ten, String ma, int gia, int soluong){
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.soluong = soluong;
    }
    public String thutu(){
        return ma.substring(1, 4);
    }
    public String getMa(){
        return ma.substring(4);
    }
    public int giam(){
        int z = Integer.parseInt(getMa());
        if(z == 1){
            return (int)(0.5 * gia * soluong);
        }
        else{
            return (int)(0.3 * gia * soluong);
        }
    }
    public String toString() {
        int tong = gia * soluong - giam();
        return ten + " " + ma + " " + thutu() + " " + giam() + " " + tong;
    }
}
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<DonHang> list = new ArrayList<DonHang>();
        while(n-- > 0) {
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int soluong = Integer.parseInt(sc.nextLine());
            list.add(new DonHang(ten, ma, gia, soluong));
        }
        for(DonHang d : list){
            System.out.println(d);
        }
    }
}
