import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;


public class SinhVien1{
    private String ma, name, lop, gmail;
    public SinhVien1(String ma, String name, String lop, String gmail){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.gmail = gmail;
    }
    public String chuanTen(){
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += Character.toUpperCase(arr[i].charAt(0));
            for(int j = 1; j < arr[i].length(); j++){
                res += arr[i].charAt(j);
            }
            res += " ";
        }
        name = res.substring(0, res.length() - 1);
        return name;
    }
    public String getMa(){
        return ma;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " " + gmail;
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = sc.nextInt();
            sc.nextLine();
            Vector<SinhVien1> list = new Vector<SinhVien1>();
            for(int i = 0; i < n; i++){
                String ma = sc.nextLine();
                String name = sc.nextLine();
                String lop = sc.nextLine();
                String gmail = sc.nextLine();
                SinhVien1 s = new SinhVien1(ma, name, lop, gmail);
                s.chuanTen();
                list.add(s);
            }
            Collections.sort(list, new Comparator<SinhVien1>() {
                public int compare(SinhVien1 a, SinhVien1 b) {
                    if (a.getMa().compareTo(b.getMa()) > 0)
                        return 1;
                    return -1;
                }
            });
            for(SinhVien1 x : list){
                System.out.println(x);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}