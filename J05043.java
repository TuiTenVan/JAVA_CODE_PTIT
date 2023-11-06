import java.util.*;

class LuongNhanVien{
    static int i = 1;
    private String ma,  name, chuc;
    private int luong, ngay;
    public LuongNhanVien(String name, String chuc, int luong, int ngay){
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
    public int TamUng(){
        double x = Luong() + PhuCap();
        if(x  * 2 / 3 < 25000){
            return(int) Math.round((x * 2/ 3) / 1000) * 1000;
        }
        else{
            return 25000;
        }
    }
    public int ConLai(){
        return (int)Math.round(Luong() + PhuCap()- TamUng());
    }
    public String toString(){
        return ma + " " + name + " " + PhuCap() + " " + Luong() + " " + TamUng() + " " + ConLai();
    }
}
public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<LuongNhanVien> list = new ArrayList<LuongNhanVien>();
        while(n-- > 0) {
            LuongNhanVien nv = new LuongNhanVien(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            list.add(nv); 
        }
        for(LuongNhanVien nv : list) {
            System.out.println(nv);
        }
    }
}
