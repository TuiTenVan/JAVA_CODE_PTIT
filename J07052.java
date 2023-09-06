import java.util.*;
import java.io.*;

class ThiSinh{
    private String ma, name;
    private double toan, ly, hoa;
    public ThiSinh(String ma, String name, double toan, double ly, double hoa){
        this.ma = ma;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public String chuanHoa(){
        String res = "";
        name = name.trim().toLowerCase();
        String[] arr = name.split("\\s+");
        for(int i=0; i < arr.length; i++){
            res += Character.toUpperCase(arr[i].charAt(0));
            for(int j=1; j < arr[i].length(); j++){
                res += arr[i].charAt(j);
            }
            res += " ";
        }
        name = res.trim();
        return name;
    }
    public double UuTien(){
        int x = ma.charAt(2) - '0';
        if(x == 1){
            return 0.5;
        }
        else if(x == 2){
            return 1.0;
        }
        else{
            return 2.5;
        }
    }
    public double tong(){
        double k = toan * 2 + ly + hoa;
        int x = ma.charAt(2) - '0';
        if(x == 1){
            k += 0.5;
        }
        else if(x == 2){
            k += 1.0;
        }
        else{
            k += 2.5;
        }
        return k;
    }
    public String getUutien(){
        if(UuTien() == (int)UuTien()){
            return Integer.toString((int)UuTien());
        }
        else{
            return Double.toString(UuTien());
        }
    }
    public String getTong(){
        if(tong() == (int)tong()){
            return Integer.toString((int)tong());
        }
        else{
            return Double.toString(tong());
        }
    }
    public String toString(){
        return ma + " " + name + " " + getUutien() + " " + getTong() + " ";
    }
}
public class J07052 {
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<ThiSinh> list = new ArrayList<>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String toans = sc.nextLine();
            double toan = Double.parseDouble(toans);
            String lys = sc.nextLine();
            double ly = Double.parseDouble(lys);
            String hoas = sc.nextLine();
            double hoa = Double.parseDouble(hoas);
            ThiSinh ts = new ThiSinh(ma, name, toan, ly, hoa);
            ts.chuanHoa();
            list.add(ts);
        }
        int x = sc.nextInt();
        int cnt = 0;
        double diemChuan = 0;
        list.sort((s1, s2) -> Double.compare(s2.tong(), s1.tong()));
        for(int i = 0; i < list.size(); i++) {
            if(cnt == x){
                break;
            }
            diemChuan = list.get(i).tong();
            cnt++;
        }
        System.out.println(diemChuan);
        for(ThiSinh i : list){
            if(i.tong() >= diemChuan){
                System.out.println(i + "TRUNG TUYEN");
            }
            else{
                System.out.println(i + "TRUOT");
            }
        }
        sc.close();
    }
}
