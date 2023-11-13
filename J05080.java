import java.util.*;

class LopHocPhan2{
    private String ma, ten, nhom, name;
    public LopHocPhan2(String ma, String ten, String nhom, String name){
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
    public String getName(){
        return name;
    }
    public String toString(){
        return ma + " " + ten + " " + nhom;
    }
}
public class J05080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<LopHocPhan2> list = new ArrayList<LopHocPhan2>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String name = sc.nextLine();
            list.add(new LopHocPhan2(ma, ten, nhom, name));
        }
        list.sort((s1, s2) -> {
            if(s1.getMa().equals(s2.getMa())){
                return s1.getNhom().compareTo(s2.getNhom());
            }
            else{
                return s1.getMa().compareTo(s2.getMa());
            }
        });
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            String res = "";
            for(LopHocPhan2 h : list){
                if(h.getName().equals(s)){
                    res = h.getName();
                }
            }
            System.out.println("Danh sach cho giang vien " + res + ":");
            for(LopHocPhan2 h : list){
                if(h.getName().equals(s)){
                    System.out.println(h);
                }
            }
        }
    }
}
