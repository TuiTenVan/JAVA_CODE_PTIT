import java.util.*;
import java.io.*;


class MonThi{
    private String ma, ten, hthuc;
    public MonThi(String ma, String ten, String hthuc){
        this.ma = ma;
        this.ten = ten;
        this.hthuc = hthuc;
    }
    public String getMa(){
        return ma;
    }
    public String toString() {
        return ma + " " + ten + " " + hthuc;
    }
}
public class J07058 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MonThi> list = new ArrayList<>();
        while(t-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hthuc = sc.nextLine();
            MonThi m = new MonThi(ma, ten, hthuc);
            list.add(m);
        }  
        list.sort((s1, s2) -> s1.getMa().compareTo(s2.getMa()));
        for(MonThi m : list) {
            System.out.println(m);
        }
        sc.close();
    }
}
