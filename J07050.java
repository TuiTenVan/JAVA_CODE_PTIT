import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.*;

class MatHang{
    public static int i = 1;
    private String ma, ten, nhom;
    private float mua, ban;
    public MatHang(String ten, String nhom, float mua, float ban){
        this.ma = "MH" + String.format("%02d", i++);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public float LoiNhuan(){
        float x = ban - mua;
        return x;
    }
    public String toString(){
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", LoiNhuan());
    }
}
public class J07050 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<J05081> list = new ArrayList<J05081>();
        while(t-- > 0){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String mua1 = sc.nextLine();
            String ban1 = sc.nextLine();
            float ban = Float.parseFloat(ban1);
            float mua = Float.parseFloat(mua1);
            J05081 m = new J05081(ten, nhom, mua, ban);
            list.add(m);
        }
        list.sort((s1, s2) -> Float.compare(s2.LoiNhuan(), s1.LoiNhuan()));
        for(J05081 m : list){
            System.out.println(m);
        }
        sc.close();
    }
}