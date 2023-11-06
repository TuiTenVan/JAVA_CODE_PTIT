import java.util.*;

class TinhLuongNhanVien{
    static int i = 1;
    private String ma,  name, chuc;
    private int luong, ngay;
    public TinhLuongNhanVien(String name, String chuc, int luong, int ngay){
        this.ma = "NV" + String.format("%02d", i++);
        this.name = name;
        this.chuc = chuc;
        this.luong = luong;
        this.ngay = ngay;
    }
    public int PhuCap(){
        if(chuc.equals("GD")){
            return 500;
        }
        else if(chuc.equals("PGD")){
            return 400;
        }
        else if(chuc.equals("TP")){
            return 300;
        }
        else if(chuc.equals("KT")){
            return 250;
        }
        else{
            return 100;
        }
    }
    public int Luong(){
        return luong * ngay;
    }
    public int ThuNhap(){
        return Luong() + PhuCap();
    }
    public int TamUng(){
        double x = Luong() + PhuCap();
        if(x  * 2 / 3 < 25000){
            return(int) Math.round((x * 2/ 3) / 1000) * 1000;
        }
        else{
            return 25000;
        }
    }
    public String getChuc(){
        return chuc;
    }
    public int ConLai(){
        return (int)Math.round(Luong() + PhuCap()- TamUng());
    }
    public String toString(){
        return ma + " " + name + " " + PhuCap() + " " + Luong() + " " + TamUng() + " " + ConLai();
    }
}
public class J05045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<TinhLuongNhanVien> list = new ArrayList<TinhLuongNhanVien>();
        while(n-- > 0) {
            TinhLuongNhanVien nv = new TinhLuongNhanVien(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            list.add(nv); 
        }
        list.sort((s1, s2) -> s2.ThuNhap() - s1.ThuNhap());
        for(TinhLuongNhanVien nv : list) {
            System.out.println(nv);
        }
    }
}
