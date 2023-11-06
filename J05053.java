import java.util.*;

class SapXepDonHang{
    private String ten, ma;
    private int gia, soluong;
    public SapXepDonHang(String ten, String ma, int gia, int soluong){
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
    public long getTong(){
        return gia * soluong - giam();
    }
    public String toString() {
        // int tong = gia * soluong - giam();
        return ten + " " + ma + " " + thutu() + " " + giam() + " " + getTong();
    }
}
public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<SapXepDonHang> list = new ArrayList<SapXepDonHang>();
        while(n-- > 0) {
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int soluong = Integer.parseInt(sc.nextLine());
            list.add(new SapXepDonHang(ten, ma, gia, soluong));
        }
        list.sort((s1,s2) ->  Integer.parseInt(s1.thutu()) - Integer.parseInt(s2.thutu()));
        for(SapXepDonHang d : list){
            System.out.println(d);
        }
    }
}
