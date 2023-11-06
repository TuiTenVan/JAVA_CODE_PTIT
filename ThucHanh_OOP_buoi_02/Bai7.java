package ThucHanh_OOP_buoi_02;

import java.io.File;
import java.util.List;
import java.util.*;

class ClassSinhVien{
    private String ma, name, lop, gmail, sdt;
    public ClassSinhVien(String ma, String name, String lop, String gmail, String sdt){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.gmail = gmail;
        this.sdt = "0" + sdt;
    }
    public String getLop(){
        return lop;
    }
    public String getMa(){
        return ma;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " " + gmail + " " + sdt;
    }
}
public class Bai7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<ClassSinhVien> list = new ArrayList<ClassSinhVien>();
        while (sc.hasNextLine()) {
            ClassSinhVien sv = new ClassSinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            list.add(sv);
        }
        list.sort((s1, s2) -> {
            if(s1.getLop().equals(s2.getLop())){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                return s1.getLop().compareTo(s2.getLop());
            }
        });
        for(ClassSinhVien sv : list){
            System.out.println(sv);
        }
    }
}
