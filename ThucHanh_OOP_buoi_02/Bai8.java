package ThucHanh_OOP_buoi_02;

import java.io.File;
import java.util.List;
import java.util.*;

class DoAn implements Comparable<DoAn>{
    private SinhVien sv;
    private String gv, ChuDe;
    public DoAn(SinhVien sv, String gv, String ChuDe){
        this.sv = sv;
        this.gv = gv;
        this.ChuDe = ChuDe;
    }
    public int compareTo(DoAn o){
        return this.sv.getmsv().compareTo(o.sv.getmsv());
    }
    public String toString(){
        return this.sv.getmsv() + " " + this.sv.getten() + " " + this.gv + this.ChuDe + " " + this.sv.getsdt();
    }
}
class SinhVien{
    private String msv, ten, lop, gmail, sdt;
    public SinhVien(String msv, String ten, String lop, String gmail, String sdt){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.gmail = gmail;
        this.sdt = "0" + sdt;
    }
    public String getmsv(){
        return msv;
    }
    public String getten(){
        return ten;
    }
    public String getsdt(){
        return sdt;
    }
}
public class Bai8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, SinhVien> mp = new HashMap<String, SinhVien>();
        while (sc.hasNextLine()) {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            mp.put(sv.getmsv(), sv);
        }
        ArrayList<DoAn> arr = new ArrayList<DoAn>();
        sc = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] s = sc.nextLine().split("\\s+");
            String gv = "";
            for(int id= 0; id < s.length - 1; id++){
                gv += s[id] + " ";
            }
            int s1 = Integer.parseInt(s[s.length - 1]);
            for(int j = 0; j < s1; j++){
                String[] a = sc.nextLine().split("\\s+");
                String msv = a[0];
                String chude = "";
                for(int k = 1; k < a.length; k++){
                    chude += a[k] + " ";
                }
                arr.add(new DoAn(mp.get(msv), gv, chude));
            }
        }
        Collections.sort(arr);
        for(DoAn i : arr){
            System.out.println(i);
        }
    }
}
