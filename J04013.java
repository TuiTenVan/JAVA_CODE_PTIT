import java.util.*;

class ThiSinh{
    private String ma, name;
    private double toan, ly, hoa;
    public ThiSinh(String ma, String name, double toan, double ly, double hoa){
        this.ma = ma;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double UuTien(){
        int x = ma.charAt(2) - '0';
        if(x == 1){
            return 0.5;
        }
        else if(x == 2){
            return 1.0;
        }
        else{
            return 2.5;
        }
    }
    public double total(){
        double k = toan * 2 + ly + hoa;
        int x = ma.charAt(2) - '0';
        if(x == 1){
            k += 0.5;
        }
        else if(x == 2){
            k += 1.0;
        }
        else{
            k += 2.5;
        }
        return k;
    }
    public double tong1(){
        double x = toan * 2 + ly + hoa;
        return x;
    }
    public String getUutien(){
        if(UuTien() == (int)UuTien()){
            return Integer.toString((int)UuTien());
        }
        else{
            return Double.toString(UuTien());
        }
    }
    public String getTong1(){
        if(tong1() == (int)tong1()){
            return Integer.toString((int)tong1());
        }
        else{
            return Double.toString(tong1());
        }
    }
    public String toString(){
        return ma + " " + name + " " + getUutien() + " " + getTong1() + " ";
    }
}
public class J04013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        double toan = Double.parseDouble(sc.nextLine());
        double ly = Double.parseDouble(sc.nextLine());
        double hoa = Double.parseDouble(sc.nextLine());
        ThiSinh ts = new ThiSinh(ma, name, toan, ly, hoa);
        if(ts.total() >= 24){
            System.out.println(ts + "TRUNG TUYEN");
        }
        else{
            System.out.println(ts + "TRUOT");
        }   
    }
}
