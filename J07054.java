import java.util.*;
import java.io.*;

class SinhVien22{
    static int i = 1;
    private String ma, name;
    private int toan, ly, hoa;
    public SinhVien22(String name, int toan, int ly, int hoa){
        this.ma = "SV" + String.format("%02d", i++);
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
    public double tong(){
        double k = toan * 3 + ly * 3 + hoa * 2;
        return k / 8;
    }
    public String getMa(){
        return ma;
    }
    public String toString(){
        return ma + " " + name  + " " + String.format("%.2f",tong()) + " ";
    }
}
public class J07054 {
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<SinhVien22> list = new ArrayList<>();
        while(t-- > 0) {
            String name = sc.nextLine();
            String toans = sc.nextLine();
            int toan = Integer.parseInt(toans);
            String lys = sc.nextLine();
            int ly = Integer.parseInt(lys);
            String hoas = sc.nextLine();
            int hoa = Integer.parseInt(hoas);
            SinhVien22 ts = new SinhVien22(name, toan, ly, hoa);
            ts.chuanHoa();
            list.add(ts);
        }
        list.sort((s1, s2) -> {
            if(s1.tong() == s2.tong()){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                return Double.compare(s2.tong(), s1.tong());
            }
        });
        int hang = 0;
        double diem = -1;
        int cnt = 1;
        for(SinhVien22 i : list){
            if(i.tong() == diem){
                System.out.println(i +" " + hang);
                cnt++;
            }
            else{
                hang++;
                System.out.println(i +" " + (hang + cnt - 1));
                diem = i.tong();
            }
            
        }
        sc.close();
    }
}

