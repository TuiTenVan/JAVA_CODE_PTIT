import java.util.ArrayList;
import java.util.Scanner;


class NhanVien{
    private static int i = 1;
    private String stt, name, gt, birth, add, ma, day;
    public NhanVien(String name, String gt, String birth, String add, String ma, String day){
        this.stt = String.format("%05d", i++);
        this.name = name;
        this.gt = gt;
        this.birth = birth;
        this.add = add;
        this.ma = ma;
        this.day = day;
    }
    public String toString(){
        return stt + " " + name + " " + gt + " " + birth + " " + add + " " + ma + " " + day;
    }
}
public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        while(t-- > 0){
            String name = sc.nextLine();
            String gt = sc.nextLine();
            String birth = sc.nextLine();
            String add = sc.nextLine();
            String ma = sc.nextLine();
            String day = sc.nextLine();
            NhanVien n = new NhanVien(name, gt, birth, add, ma, day);
            list.add(n);
        }
        for(NhanVien n : list){
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