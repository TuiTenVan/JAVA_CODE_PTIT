import java.util.Scanner;

class NhanVien{
    private String name;
    private String sex;
    private String birth;
    private String add;
    private String ma;
    private String day;
    public NhanVien(String name, String sex, String birth, String add, String ma, String day) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.add = add;
        this.ma = ma;
        this.day = day;
    }
    public String toString(){
        return "00001 " + name + " " + sex + " " + birth + " " + add + " " + ma + " " + day;
    }
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String birth = sc.nextLine();
        String add = sc.nextLine();
        String ma = sc.nextLine();
        String day = sc.nextLine();
        NhanVien v = new NhanVien(name, sex, birth, add, ma, day);
        System.out.println(v);
    }
}
