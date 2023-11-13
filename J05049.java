import java.util.*;

class XuatHang{
    private String ma;
    private int soluong;
    public XuatHang(String ma, int soluong){
        this.ma = ma;
        this.soluong = soluong;
    }
    public String Nhom(){
        String start = Character.toString(ma.charAt(0));
        return start;
    }
    public int getXuat(){
        String start = Character.toString(ma.charAt(0));
        if(start.equals("A")){
            return (int)Math.round(soluong * 0.6);
        }
        else{
            return (int)Math.round(soluong * 0.7);
        }
    }
    public int DonGia(){
        String end = Character.toString(ma.charAt(ma.length() - 1));
        if(end.equals("Y")){
            return 110000;
        }
        else {
            return 135000;
        }
    }
    public long Tien(){
        long tien = 0;
        String end = Character.toString(ma.charAt(ma.length() - 1));
        if(end.equals("Y")){
            tien = getXuat() * 110000;
        }
        else if(end.equals("N")){
            tien = getXuat() * 135000;
        }
        return tien;
    }
    public long Thue(){
        String end = Character.toString(ma.charAt(ma.length() - 1));
        String start = Character.toString(ma.charAt(0));
        if(end.equals("Y") && start.equals("A")){
            return (int)(Tien() * 0.08);
        }
        else if(end.equals("N") && start.equals("A")){
            return (int)(Tien() * 0.11);
        }
        else if(end.equals("Y") && start.equals("B")){
            return  (int)(Tien() * 0.17);
        }
        else{
            return  (int)(Tien() * 0.22);
        }
    }
    public String toString(){
        return ma + " " + soluong + " " + getXuat() + " " + DonGia() + " " + Tien() + " " + Thue();
    }
}
public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<XuatHang> list = new ArrayList<XuatHang>();
        while(t-- > 0){
            String ma = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
            list.add(new XuatHang(ma, soluong));
        }
        String s = sc.nextLine();
        list.sort((s1, s2) -> Long.compare(s2.Thue(), s1.Thue()));
        for(XuatHang x : list){
            if(x.Nhom().equals(s)){
                System.out.println(x);
            }
        }
    }
}
