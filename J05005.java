import java.util.ArrayList;
import java.util.Scanner;

class ClassPerson{
    static int i = 1;
    private String ma, name, lop, birth;
    private double gpa;
    public ClassPerson(String name, String lop, String birth, double gpa) {
        this.ma = "B20DCCN" + String.format("%03d", i++);
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }
    public String chuanHoa(){
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
        birth = sb.toString();
        return birth;
    }
    public String chuanTen(){
        String res = "";
        name = name.toLowerCase().trim();
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
    public double getGpa(){
        return gpa;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " " + birth + " " + String.format("%.2f", gpa);
    }
}
public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ClassPerson> list = new ArrayList<>();
        while(t-- > 0) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String birth = sc.nextLine();
            String diem1 = sc.nextLine();
            double gpa = Double.parseDouble(diem1);
            ClassPerson p = new ClassPerson(name, lop, birth, gpa);
            p.chuanTen();
            p.chuanHoa();
            list.add(p);
        }
        list.sort((s1,s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        for (ClassPerson p : list) {
            System.out.println(p);
        }
    }
}
