import java.io.*;
import java.text.*;
import java.util.*;

class LuuTru{
    public static int i = 1;
    private String mkh, name, ma;
    private Date den, di;
    public LuuTru(String name, String ma, String den, String di) throws ParseException {
        this.mkh = "KH" + String.format("%02d", i++);
        this.name = name;
        this.ma = ma;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
    }
    public long getLuuTru() { 
        long k =(di.getTime() - den.getTime());
        long x = k /  (60 * 60 * 24 * 1000);
        return x;
    }
    public String toString() {
        return mkh + " " + name + " " + ma + " " + getLuuTru();
    }
}
public class J07046 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<LuuTru> list = new ArrayList<LuuTru>();
        while(t-- > 0){
            String name = sc.nextLine();
            String ma = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            LuuTru x = new LuuTru(name, ma, den, di);
            list.add(x);
        }
        Collections.sort(list, new Comparator<LuuTru>() {
            public int compare(LuuTru a, LuuTru b){
                return Long.compare(b.getLuuTru(), a.getLuuTru());
            }
        });
        for(LuuTru x : list){
            System.out.println(x);
        }
        sc.close();
    }
}
