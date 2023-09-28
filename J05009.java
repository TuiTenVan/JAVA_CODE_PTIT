import java.util.*;

class Class22{
    static int i = 1;
    private int ma;
    private String name, birth;
    private double mon1, mon2, mon3;
    public Class22(String name, String birth, double mon1, double mon2, double mon3){
        this.ma = i++;
        this.name = name;
        this.birth = birth;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    public int getma(){
        return ma;
    }
    public double total(){
        return mon1 + mon2 + mon3;
    }
    public String toString() {
        return ma + " " + name + " " + birth + " " + total() + " ";
    }
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Class22> list = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String birth = sc.nextLine();
            Double mon1 = Double.parseDouble(sc.nextLine());
            Double mon2 = Double.parseDouble(sc.nextLine());
            Double mon3 = Double.parseDouble(sc.nextLine());
            list.add(new Class22(name, birth, mon1, mon2, mon3));
        }
        double ans = 0;
        for(Class22 c : list){
            ans = Math.max(ans, c.total());
        }
        for(Class22 c : list){
            if(c.total() == ans)
                System.out.println(c);
        }
    }   
}
