import java.util.*;

class SapXepThiSinh{
    private String ma, name;
    private double toan, ly, hoa;
    public SapXepThiSinh(String ma, String name, double toan, double ly, double hoa){
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
    public double KhongUuTien(){
        return toan * 2 + ly + hoa;
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
    public String getKhongUuTien(){
        if(KhongUuTien() == (int)KhongUuTien()){
            return Integer.toString((int)KhongUuTien());
        }
        else{
            return Double.toString(KhongUuTien());
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
public class J05058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<SapXepThiSinh> list = new ArrayList<>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            SapXepThiSinh ts = new SapXepThiSinh(ma, name, toan, ly, hoa);
            ts.chuanHoa();
            list.add(ts);
        }
        list.sort((s1, s2) -> Double.compare(s2.tong(), s1.tong()));
        for(SapXepThiSinh i : list){
            if(i.tong() >= 24){
                System.out.println(i + "TRUNG TUYEN");
            }
            else{
                System.out.println(i + "TRUOT");
            }
        }
    }
}
