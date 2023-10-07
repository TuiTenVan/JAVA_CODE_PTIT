import java.util.*;


class ClassSV{
    private String ma, name, lop;
    private Double a, b, c;
    public ClassSV(String ma, String name, String lop, Double a, Double b, Double c){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getMa() {
        return ma;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " " + String.format("%.1f", a) + " " + String.format("%.1f", b) + " " + String.format("%.1f", c);
    }
}
public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ClassSV> list = new ArrayList<ClassSV>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            Double a = Double.parseDouble(sc.nextLine());
            Double b = Double.parseDouble(sc.nextLine());
            Double c = Double.parseDouble(sc.nextLine());
            list.add(new ClassSV(ma, name, lop, a, b, c));
        }
        list.sort((s1, s2) -> {
            // int x = Integer.parseInt(s1.getMa().substring(7));
            // int y = Integer.parseInt(s2.getMa().substring(7));
            return s1.getName().compareTo(s2.getName());
        });
        int i = 1;
        for(ClassSV a : list) {
            System.out.println(i + " " + a);
            i++;
        }
    }
}
