import java.io.File;
import java.util.*;

class ClassThiSinh{
    static int i = 1;
    private String ma, name;
    private Double diem;
    private String dtoc, kvuc;
    public ClassThiSinh(String name, double diem, String dtoc, String kvuc){
        this.ma = "TS" + String.format("%02d", i++);
        this.name = name;
        this.diem = diem;
        this.dtoc = dtoc;
        this.kvuc = kvuc;
    }
    public double KhuVuc(){
        double ut = 0;
        if(dtoc.equals("Kinh")){
            ut = 0;
        }
        else{
            ut = 1.5;
        }
        if(kvuc.equals("1")){
            ut += 1.5;
        }
        else if(kvuc.equals("2")){
            ut += 1;
        }
        return ut;
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
    public double Tong(){
        return KhuVuc() + diem;
    }
    public String toString(){
        return ma + " " + name + " " + Tong() + " ";
    }
}
public class J07057 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<ClassThiSinh> list = new ArrayList<ClassThiSinh>();
        while(n-- > 0) {
            String name = sc.nextLine().trim();
            String value = sc.nextLine();
            double diem = Double.parseDouble(value);
            String dtoc = sc.nextLine();
            String kvuc = sc.nextLine();
            ClassThiSinh t = new ClassThiSinh(name, diem, dtoc, kvuc);
            t.chuanHoa();
            list.add(t);
        }
        list.sort((s1,s2) -> Double.compare(s2.Tong(), s1.Tong()));
        for(ClassThiSinh t : list){
            if(t.Tong() >= 20.5){
                System.out.println(t + "Do");
            }
            else{
                System.out.println(t + "Truot");
            }
        }
    }
}
