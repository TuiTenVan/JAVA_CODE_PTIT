import java.util.*;

class CheckTime{
    private String ma, name, vao, ra;
    public CheckTime(String ma, String name, String vao, String ra){
        this.ma = ma;
        this.name = name;
        this.vao = vao;
        this.ra = ra;
    }
    public int checkTime1(){
        int a = Integer.parseInt(vao.substring(0, 2));
        int b = Integer.parseInt(vao.substring(3));
        int c = Integer.parseInt(ra.substring(0, 2));
        int d = Integer.parseInt(ra.substring(3));
        int x = a * 60 + b;
        int y = c * 60 + d;
        int k = y - x;
        return k;
    }
    public String checkTime2(){
        int a = Integer.parseInt(vao.substring(0, 2));
        int b = Integer.parseInt(vao.substring(3));
        int c = Integer.parseInt(ra.substring(0, 2));
        int d = Integer.parseInt(ra.substring(3));
        int x = a * 60 + b;
        int y = c * 60 + d;
        int k = y - x;
        String res = "";
        if(k > 60 ){
            res = k / 60 + " gio " + (k - (k / 60) * 60) + " phut";
        }
        else{
            res = "0 gio " + k + " phut";
        }
        return res;
    }
    public String toString() {
        return ma + " " + name + " " + checkTime2();
    }
}
public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<CheckTime> list = new ArrayList<CheckTime>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String name = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            CheckTime c = new CheckTime(ma, name, vao, ra);
            list.add(c);
        }
        list.sort((s1, s2) -> s2.checkTime1() - s1.checkTime1());
        for (CheckTime c : list){
            System.out.println(c);
        }
    }
}
