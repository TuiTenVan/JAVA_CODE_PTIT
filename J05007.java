// import java.sql.Date;
import java.text.ParseException;
// import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


class ClassNhanVien{
    private static int i = 1;
    private String stt, name, gt;
    private String birth;
    private String add, ma, day;
    public ClassNhanVien(String name, String gt, String birth, String add, String ma, String day){
        this.stt = String.format("%05d", i++);
        this.name = name;
        this.gt = gt;
        this.birth = birth;
        this.add = add;
        this.ma = ma;
        this.day = day;
    }
    public String check(){
        return birth;
    }
    public String toString(){
        return stt + " " + name + " " + gt + " " + birth + " " + add + " " + ma + " " + day;
    }
}
public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ClassNhanVien> list = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String gt = sc.nextLine();
            String birth = sc.nextLine();
            String add = sc.nextLine();
            String ma = sc.nextLine();
            String day = sc.nextLine();
            ClassNhanVien n = new ClassNhanVien(name, gt, birth, add, ma, day);
            list.add(n);
        }
        list.sort((s1,s2) -> {
            String x1 = s1.check().substring(0, 2);
            String x2 = s2.check().substring(0, 2);
            String y1 = s1.check().substring(3, 5);
            String y2 = s2.check().substring(3, 5);
            String z1 = s1.check().substring(6);
            String z2 = s2.check().substring(6);
            if(z1.equals(z2)){
                if(y1.equals(y2)){
                    return x1.compareTo(x2);
                }
                else{
                    return y1.compareTo(y2);
                }
            }
            else{
                return z1.compareTo(z2);
            }
        });
        for(ClassNhanVien n : list){
            System.out.println(n);
        }
    }
}
// 3
// Nguyen Van A
// Nam
// 22/10/1982
// Mo Lao-Ha Dong-Ha Noi
// 8333012345
// 31/12/2013
// Ly Thi B
// Nu
// 15/10/1988
// Mo Lao-Ha Dong-Ha Noi
// 8333012346
// 22/08/2011
// Hoang Thi C
// Nu
// 04/02/1981
// Mo Lao-Ha Dong-Ha Noi
// 8333012347
// 22/08/2011
