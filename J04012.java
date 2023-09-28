import java.util.*;

class Luong{
    static int i = 1;
    private String ma, name;
    private int fee, cong;
    private String cvu;
    public Luong(String name, int fee, int cong, String cvu) {
        this.ma = "NV" + String.format("%02d", i++); 
        this.cong = cong;
        this.fee = fee;
        this.name = name;
        this.cvu = cvu;
    }
    public int phucap(){
        if(cvu.equals("GD")){
            return 250000;
        }
        else if(cvu.equals("PGD")){
            return 200000;
        }
        else if(cvu.equals("TP")){
            return 180000;
        }
        else{
            return 150000;
        }
    }
    public int thuong(){
        int luong = cong * fee;
        if(cong >= 25){
            return luong * 20 / 100;
        }
        else if(cong >= 23){
            return luong * 10 / 100;
        }
        else{
            return 0;
        }
    }
    public int total(){
        int total = cong * fee + phucap() + thuong();
        return total;
    }
    public String toString(){
        int total = fee * cong;
        return ma + " " + name + " " + total + " " + thuong() + " " + phucap() + " " + total();
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int fee = Integer.parseInt(sc.nextLine());
        int cong = Integer.parseInt(sc.nextLine());
        String cvu = sc.nextLine();
        Luong l = new Luong(name, fee, cong, cvu);
        System.out.println(l);
    }
}
