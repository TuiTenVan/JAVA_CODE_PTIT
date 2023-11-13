import java.util.*;

class LopHocPhan{
    private String ma, ten, nhom, name;
    public LopHocPhan(String ma, String ten, String nhom, String name){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.name = name;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getNhom(){
        return nhom;
    }
    public String toString(){
        return nhom + " " + name;
    }
}
public class J05079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<LopHocPhan> list = new ArrayList<LopHocPhan>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String name = sc.nextLine();
            list.add(new LopHocPhan(ma, ten, nhom, name));
        }
        list.sort((s1, s2) -> s1.getNhom().compareTo(s2.getNhom()));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            String res = "";
            for(LopHocPhan h : list){
                if(h.getMa().equals(s)){
                    res = h.getTen();
                }
            }
            System.out.println("Danh sach nhom lop mon " + res + ":");
            for(LopHocPhan h : list){
                if(h.getMa().equals(s)){
                    System.out.println(h);
                }
            }
        }
    }
}
