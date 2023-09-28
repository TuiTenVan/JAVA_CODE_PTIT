import java.util.*;


class ClassMatHang{
    static int i = 1;
    private int ma;
    private String ten, nhom, mua, ban;
    public ClassMatHang(String ten, String nhom, String mua, String ban){
        this.ma = i++;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public int getMa(){
        return ma;
    }
    public double LoiNhuan(){
        double x = Double.parseDouble(ban) - Double.parseDouble(mua);
        return x;
    }
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", LoiNhuan());
    }
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<ClassMatHang> list = new ArrayList<ClassMatHang>();
        while(t-- > 0) {
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String mua = sc.nextLine();
            String ban = sc.nextLine();
            list.add(new ClassMatHang(ten, nhom, mua, ban));
        }
        list.sort((s1, s2) -> Double.compare(s2.LoiNhuan(), s1.LoiNhuan()));
        for(ClassMatHang m : list) {
            System.out.println(m);
        }
    }
}
// 3
// May tinh SONY VAIO
// Dien tu
// 16400
// 17699
// Tu lanh Side by Side
// Dien lanh
// 18300
// 25999
// Banh Chocopie
// Tieu dung
// 27.5
// 37