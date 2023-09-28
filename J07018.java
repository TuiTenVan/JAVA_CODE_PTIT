import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class ObjectSinhVien{
    static int i = 1;
    private String ma, name, lop, birth;
    private double gpa;
    public ObjectSinhVien(String name, String lop, String birth, double gpa){
        this.ma = "B20DCCN" + String.format("%03d", i);
        i++;
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }
    public String chuanTen(){
        String res = "";
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        for(int i = 0; i < arr.length; i++){
            res += Character.toUpperCase(arr[i].charAt(0));
            for(int j = 1; j < arr[i].length(); j++){
                res += arr[i].charAt(j);
            }
            res += " ";
        }
        name = res.trim();
        return name;
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
public class J07018{
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int t = sc.nextInt();
            sc.nextLine();
            ArrayList<ObjectSinhVien> list = new ArrayList<>();
            for(int i = 0; i < t; i++) {
                String name = sc.nextLine().trim();
                String lop = sc.nextLine().trim();
                String birth = sc.nextLine().trim();
                double gpa = Double.parseDouble(sc.nextLine().trim());
                ObjectSinhVien sv = new ObjectSinhVien(name, lop, birth, gpa);
                sv.chuanHoa();
                sv.chuanTen();
                list.add(sv);
            }
            for(ObjectSinhVien sv : list) {
                System.out.println(sv);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}