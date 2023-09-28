import java.io.File;
import java.util.*;

class TienDien{
    static int i = 1;
    private String ma, name, loai, dau, cuoi;
    public TienDien(String name, String loai, String dau, String cuoi){
        this.ma = "KH" + String.format("%02d", i++);
        this.name = name;
        this.loai = loai;
        this.dau = dau;
        this.cuoi = cuoi;
    }
    public String chuanHoa(){
        String res = "";
        name = name.toLowerCase();
        String[] a = name.split("\\s+");
        for(int i = 0; i < a.length; i++){
            res += Character.toUpperCase(a[i].charAt(0));
            for(int j = 1; j < a[i].length(); j++){
                res += a[i].charAt(j);
            }
            res += " ";
        }
        name = res.trim();
        return name;
    }
    public int Loai(){
        if(loai.equals("A")){
            return 100;
        }
        else if (loai.equals("B")){
            return 500;
        }
        else{
            return 200;
        }
    }
    public int tong() {
        int x = Integer.parseInt(cuoi) - Integer.parseInt(dau);
        int vat = 0;
        int vuot = 0;
        int dinhmuc = 0;
        int tong = 0;
        if(x <= Loai()){
            vat = 0;
            vuot = 0;
            dinhmuc = x * 450;
            tong = dinhmuc;
        }
        else{
            dinhmuc = Loai() * 450;
            vuot = (x - Loai()) * 1000;
            vat = vuot * 5 / 100;
            tong = vat + dinhmuc + vuot;
        }
        // return ma + " " + name + " " + dinhmuc + " " + vuot + " " + vat + " " + tong;
        return tong;
    }
    public String toString() {
        int x = Integer.parseInt(cuoi) - Integer.parseInt(dau);
        int vat = 0;
        int vuot = 0;
        int dinhmuc = 0;
        int tong = 0;
        if(x <= Loai()){
            vat = 0;
            vuot = 0;
            dinhmuc = x * 450;
            tong = dinhmuc;
        }
        else{
            dinhmuc = Loai() * 450;
            vuot = (x - Loai()) * 1000;
            vat = vuot * 5 / 100;
            tong = vat + dinhmuc + vuot;
        }
        return ma + " " + name + " " + dinhmuc + " " + vuot + " " + vat + " " + tong;
    }
}
public class J07056{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<TienDien> list = new ArrayList<>();
        while(n-- > 0){
            String name = sc.nextLine().trim();
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            String loai = arr[0];
            String dau = arr[1];
            String cuoi = arr[2];
            TienDien x = new TienDien(name, loai, dau, cuoi);
            x.chuanHoa();
            list.add(x);
        }
        list.sort((s1, s2) -> s2.tong() - s1.tong());
        for(TienDien x : list){
            System.out.println(x);
        }
    }
}