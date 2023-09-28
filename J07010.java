import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class SinhVien{
    public static int i = 1;
    private String ma, name, lop, birth;
    private double gpa;
    public SinhVien(String name, String lop, String birth, double gpa){
        this.ma = "B20DCCN" + String.format("%03d", i);
        i++;
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }
    public String chuanHoa(){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/'){
            sb.insert(0, '0');
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, '0');
        }
        birth = sb.toString();
        return birth;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " " + birth + " " + String.format("%.2f",gpa);
    }
}
public class J07010{
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SV.in"));
            int t = sc.nextInt();
            sc.nextLine();
            ArrayList<SinhVien> list = new ArrayList<>();
            for(int i = 0; i < t; i++) {
                String name = sc.nextLine();
                String lop = sc.nextLine();
                String birth = sc.nextLine();
                String s = sc.nextLine();
                double gpa = Double.parseDouble(s);
                SinhVien sv = new SinhVien(name, lop, birth, gpa);
                sv.chuanHoa();
                list.add(sv);
            }
            sc.close();
            for(SinhVien sv : list) {
                System.out.println(sv);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}