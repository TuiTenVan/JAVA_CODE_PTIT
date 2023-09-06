import java.util.*;

class SinhVien{
    private String ma, name, lop, email;
    public SinhVien(String ma, String name, String lop, String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public String getMa(){
        return ma;
    }
    public String getLop(){
        return lop;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }
}
public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> s = new ArrayList<SinhVien>();
        while(sc.hasNextLine()) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien x = new SinhVien(ma, name, lop, email);
            s.add(x);
        }
        s.sort((s1, s2) -> {
            return s1.getMa().compareTo(s2.getMa());
        });
        for(SinhVien i : s){
            System.out.println(i);
        }
    }
}
