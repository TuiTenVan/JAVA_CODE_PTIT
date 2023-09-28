import java.io.*;
import java.util.*;

class ClassPerSon{
    public static int i = 1;
    private String ma, name;
    private int lt, th, thi;
    public ClassPerSon(String name, int lt, int th, int thi) {
        this.ma = "SV" + String.format("%02d", i++);
        this.name = name;
        this.lt = lt;
        this.th = th;
        this.thi = thi;
    }
    public String chuanHoa(){
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
    public double diemTB(){
        double x = lt * 0.25 + th * 0.35 + thi * 0.4;
        return x;
    }
    public String toString(){
        return ma + " " + name + " " + String.format("%.2f",diemTB()) + " ";
    }
}
public class J07055 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = sc.nextInt();
        // sc.nextLine();
        ArrayList<ClassPerSon> list = new ArrayList<>();
        while(t-- > 0) {
            sc.nextLine();
            ClassPerSon s = new ClassPerSon(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            // sc.nextLine();
            s.chuanHoa();
            list.add(s);
        }   
        list.sort((s1, s2) -> {
            return Double.compare(s2.diemTB(), s1.diemTB());
        });
        for(ClassPerSon i : list) {
            if(i.diemTB() >= 8){
                System.out.println(i + "GIOI");
            }
            else if(i.diemTB() >= 6.5){
                System.out.println(i + "KHA");
            }
            else if(i.diemTB() >= 5){
                System.out.println(i + "TRUNG BINH");
            }
            else if(i.diemTB() < 5){
                System.out.println(i + "KEM");
            }
        }
        sc.close();
    }
}
