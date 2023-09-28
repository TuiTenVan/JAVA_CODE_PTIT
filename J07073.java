import java.io.File;
import java.util.*;

class ClassMonHoc{
    private String ma, ten;
    private int tinchi;
    private String LyThuyet, ThucHanh;
    public ClassMonHoc(String ma, String ten, int tinchi, String LyThuyet, String ThucHanh){
        this.ma = ma;
        this.ten = ten;
        this.tinchi = tinchi;
        this.LyThuyet = LyThuyet;
        this.ThucHanh = ThucHanh;
    }
    public String getThucHanh(){
        return ThucHanh;
    }
    public String getMa(){
        return ma;
    }
    public String toString(){
        return ma + " " + ten + " " + tinchi + " " + LyThuyet + " " + ThucHanh;
    }
}
public class J07073 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<ClassMonHoc> list = new ArrayList<>();
        while(n-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String tinchi1 = sc.nextLine();
            int tinchi = Integer.parseInt(tinchi1);
            String LyThuyet = sc.nextLine();
            String ThucHanh = sc.nextLine();
            ClassMonHoc m = new ClassMonHoc(ma, ten, tinchi, LyThuyet, ThucHanh);
            list.add(m);
        }
        list.sort((s1, s2) -> s1.getMa().compareTo(s2.getMa()));
        for(ClassMonHoc m : list){
            if(m.getThucHanh().equals("Truc tuyen")){
                System.out.println(m);
            }
            else if(m.getThucHanh().contains(".ptit.edu.vn")){
                System.out.println(m);
            }
        }
    }
}
