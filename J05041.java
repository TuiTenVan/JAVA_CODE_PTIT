import java.util.*;

class ClassLuong{
    static int i = 1;
    private String ma, name;
    private int fee, cong;
    private String cvu;
    public ClassLuong(String name, int fee, int cong, String cvu) {
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
        int ClassLuong = cong * fee;
        if(cong >= 25){
            return ClassLuong * 20 / 100;
        }
        else if(cong >= 22){
            return ClassLuong * 10 / 100;
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
public class J05041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ClassLuong> list = new ArrayList<ClassLuong>();
        while(t-- > 0) {
            String name = sc.nextLine();
            int fee = Integer.parseInt(sc.nextLine());
            int cong = Integer.parseInt(sc.nextLine());
            String cvu = sc.nextLine();
            ClassLuong l = new ClassLuong(name, fee, cong, cvu);
            list.add(l);
        }
        list.sort((s1,s2) -> s2.total() - s1.total());
        for(ClassLuong l : list){
            System.out.println(l);
        }
       
    }
}
