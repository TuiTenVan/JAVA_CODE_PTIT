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
public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<SinhVien> s = new ArrayList<SinhVien>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien x = new SinhVien(ma, name, lop, email);
            s.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String k = sc.nextLine(); 
            System.out.println("DANH SACH SINH VIEN KHOA " + k + ":");
            for(SinhVien i : s){
                String res = i.getLop().substring(1,3);
                String kk = k.substring(2);
                if(res.equals(kk)){
                    System.out.println(i);
                }
            }
        }
    }
}
