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
public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<SinhVien> s = new ArrayList<SinhVien>();
        sc.nextLine();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien x = new SinhVien(ma, name, lop, email);
            s.add(x);
        }
        s.sort((s1, s2) -> {
            if(s1.getLop().equals(s2.getLop())){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                return s1.getLop().compareTo(s2.getLop());
            }
        });
        for(SinhVien i : s){
            System.out.println(i);
        }
    }
}
