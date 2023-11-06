package ThucHanh_OOP_buoi_01;

import java.util.*;
import java.io.*;

class ClassMonHoc22{
    private String ma, ten, hthuc;
    public ClassMonHoc22(String ma, String ten, String hthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hthuc = hthuc;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String toString() {
        return ma + " " + ten + " " + hthuc;
    }
}
public class Bai13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<ClassMonHoc22> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hthuc = sc.nextLine();
            ClassMonHoc22 m = new ClassMonHoc22(ma, ten, hthuc);
            list.add(m);
        }
        list.sort((s1, s2) -> s1.getMa().compareTo(s2.getMa()));
        String res = "";
        for(ClassMonHoc22 m : list) {
            if(!res.equals(m.getMa())){
                System.out.println(m);
            }
            res = m.getMa();
        }
    }
}
