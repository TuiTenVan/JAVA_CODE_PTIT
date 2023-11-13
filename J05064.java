import java.util.List;
import java.util.*;
class ThuNhapGiaoVien {
    private String ma, name;
    private long fee;
    public ThuNhapGiaoVien(String ma, String name, long fee) {
        this.ma = ma;
        this.name = name;
        this.fee = fee;
    }
    public String getMa(){
        return ma;
    }
    public String toString() {
        long luong = 0;
        long k = 0;
        if(ma.charAt(1) == 'T'){
            k = 2000000;
        }
        else if(ma.charAt(1) == 'P'){
            k = 900000;
        }
        else{
            k = 500000;
        }
        String x = ma.substring(2);
        luong = Integer.parseInt(x) * fee + k;
        return ma + " " + name + " " + Integer.parseInt(x)  + " " + k + " " + luong;
    }
}
public class J05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThuNhapGiaoVien> list = new ArrayList<ThuNhapGiaoVien>();
        while(n-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            long fee = sc.nextLong();
            sc.nextLine();
            ThuNhapGiaoVien t = new ThuNhapGiaoVien(ma, name, fee);
            list.add(t);
        }
        int cntHT = 0, cntHP = 0;
        for(ThuNhapGiaoVien t : list) {
            String s = t.getMa().substring(0, 2);
            if((s.equals("HP"))){
                cntHP++;
                if(cntHP <= 2){
                    System.out.println(t);
                }
            }
            else if(s.equals("HT")){
                cntHT++;
                if(cntHT <= 1){
                    System.out.println(t);
                }
            }
            else{
                System.out.println(t);
            }
           
        }
    }
}