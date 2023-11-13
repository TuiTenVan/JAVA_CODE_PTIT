import java.util.Scanner;

class ThiSinh {
    private String name, birth;
    private double mon1, mon2, mon3;
    public ThiSinh(String name, String birth, double mon1, double mon2, double mon3) {
        this.name = name;
        this.birth = birth;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;        
    }
    public String toString(){
        double x = mon1 + mon2 + mon3;
        return name + " " + birth + " " + String.format("%.1f", x);
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh sv = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(sv);
    }
}
