package KTraGiuaTri;
import java.io.File;
// import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

class MonThi{
    private String ma, tenMon, hthuc;
    public MonThi(String ma, String tenMon, String hthuc){
        this.ma = ma;
        this.tenMon = tenMon;
        this.hthuc = hthuc;
    }
    public String tenMon(){
        return tenMon;
    }
}
class CaThi{
    private String ngay, gio;
    private String ID;
    public CaThi(String ngay, String gio, String ID) throws ParseException{
        this.ID = ID;
        this.ngay = ngay;
        this.gio = gio;
    }
    public String getID(){
        return ID;
    }
    public String getNgay(){
        return ngay;
    }
    public String getGio(){
        return gio;
    }
}
class LichThi{
    private String maCaThi, maMon, maNhom;
    private int soSV;
    public LichThi(String maCaThi, String maMon, String maNhom, int soSV){
        this.maCaThi = maCaThi;
        this.maMon = maMon;
        this.maNhom = maNhom;
        this.soSV = soSV;
    }
    public String getMaNhom(){
        return maNhom;
    }
    public int getSoSV(){
        return soSV;
    }
}
public class Bai4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n -- > 0){
            String ma = sc.nextLine();
            String tenMon = sc.nextLine();
            String hthuc = sc.nextLine();
        }
        sc = new Scanner(new File("CATHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        List<CaThi> cthi = new ArrayList<CaThi>();
        while(m-- > 0){
            String ngay = sc.nextLine();
            String gio = sc.nextLine();
            String ID = sc.nextLine();
            CaThi c = new CaThi(ngay, gio, ID);
        }
        sc = new Scanner(new File("LICHTHI.in"));
        int k = Integer.parseInt(sc.nextLine());
        while(k-- > 0){
            String maCaThi = sc.nextLine();
            String maMon = sc.nextLine();
            String maNhom = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
        }
    }
}
