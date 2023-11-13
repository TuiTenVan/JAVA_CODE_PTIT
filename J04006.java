
import java.util.Scanner;

class SinhVien{
    private String name;
    private String lop;
    private String birth;
    private double gpa;
    public SinhVien(String name, String lop, String birth, double gpa){
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
        return "B20DCCN001 " + name + " " + lop + " " + birth + " " + String.format("%.2f", gpa); 
    }
}
public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String birth = sc.nextLine();
        double gpa = sc.nextDouble();
        SinhVien sv = new SinhVien(name, lop, birth, gpa);
        sv.chuanHoa();
        System.out.println(sv);
    }
}