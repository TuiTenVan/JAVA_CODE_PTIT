import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class PhuHo{
    static int i = 1;
    private String ma, name;
    private String birth;
    private Double lythuyet, thuchanh;
    public PhuHo(String name, String birth, Double lythuyet, Double thuchanh){
        this.ma = "PH" + String.format("%02d", i++);
        this.name = name;
        this.birth = birth;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    public double DiemThuong(){
        if(lythuyet >= 8 && thuchanh >= 8){
            return 1;
        }
        else if (lythuyet >= 7.5 && thuchanh >= 7.5) { 
            return 0.5;
        }
        else{
            return 0;
        }
    }
    public int Tuoi(){
        int x = Integer.parseInt(birth.substring(6));
        return 2021 - x;
    }
    public int DiemTB(){
        double k = ((lythuyet + thuchanh) / 2) + DiemThuong();
        double diem = Math.round(k);
        if(diem > 10){
            diem = 10;
        }
        return (int)Math.round(diem);
    }
    public String check(){
        int diemTB = DiemTB();
        if(diemTB == 9 || diemTB == 10){
            return "Xuat sac";
        }
        else if(diemTB == 8){
            return "Gioi";
        }
        else if(diemTB == 7){
            return "Kha";
        }
        else if(diemTB <= 6 && diemTB >= 5){
            return "Trung binh";
        }
        else{
            return "Truot";
        }
    }
    public String toString(){
        return ma + " " + name + " " + Tuoi() + " " + DiemTB() + " " + check();
    }
}
public class J05060{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<PhuHo> list = new ArrayList<PhuHo>();
        while(t-- > 0){
            String name = sc.nextLine();
            String birth = sc.nextLine();
            Double lythuyet = Double.parseDouble(sc.nextLine()); 
            Double thuchanh = Double.parseDouble(sc.nextLine()); 
            PhuHo p = new PhuHo(name, birth, lythuyet, thuchanh);
            list.add(p);
        }  
        for(PhuHo p : list){
            System.out.println(p);
        }
    }
}