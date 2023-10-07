import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

class ClassKhachHang {
    static int i = 1;
    private String ma, name, sex, birth, address;
    private Date time;
    public ClassKhachHang(String name, String sex, String birth, String address) throws ParseException{
        this.ma = "KH" + String.format("%03d", i++);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        
        time = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.address = address;
    }
    public long checkTime(){
        long x = time.getTime();
        return x / (60 * 60 * 24 * 1000);
    }
    public String chuanTen(){
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
    public void chuanHoa(){
        StringBuilder s = new StringBuilder(birth);
        if (s.charAt(1) == '/') {
            s.insert(0, '0');
        }
        if (s.charAt(4) == '/') {
            s.insert(3, '0');
        }
        birth = s.toString();
    }
    public String toString(){
        return ma + " " + name + " " + sex + " " + address + " " + birth;
    }
}

public class J07025 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<ClassKhachHang> list = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine().trim();
            String sex = sc.nextLine().trim();
            String birth = sc.nextLine().trim();
            String address = sc.nextLine().trim();
            ClassKhachHang k = new ClassKhachHang(name, sex, birth, address);
            k.chuanHoa();
            k.chuanTen();
            list.add(k);
        } 
        list.sort((s1, s2) -> Long.compare(s1.checkTime(), s2.checkTime()));
        for(ClassKhachHang k : list){
            System.out.println(k);
        }
    }
}

