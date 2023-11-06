import java.util.*;

class SinhVienThucTap{
    static int i = 1;
    private int stt;
    private String msv, name, lop, email, DoanhNghiep;
    public SinhVienThucTap(String msv, String name, String lop, String email, String DoanhNghiep){
        this.stt = i++;
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.DoanhNghiep = DoanhNghiep;
    }
    public String getMsv() {
        return msv;
    }
    public String getDoanhNghiep(){
        return DoanhNghiep;
    }
    public String toString() {
        return stt + " " + msv + " " + name + " " + lop + " " + email + " " + DoanhNghiep;
    }
}
public class J05035{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVienThucTap> list = new ArrayList<SinhVienThucTap>();
        while(t-- > 0) {
            SinhVienThucTap svc = new SinhVienThucTap(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(svc);
        }
        int q = Integer.parseInt(sc.nextLine());
        list.sort((s1, s2) -> s1.getMsv().compareTo(s2.getMsv()));
        while(q-- > 0) {
            String s = sc.nextLine();
            for(SinhVienThucTap sv : list){
                if(sv.getDoanhNghiep().equals(s)){
                    System.out.println(sv);
                }
            }
        }
    }
}