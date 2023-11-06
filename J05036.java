import java.util.*;

class MatHang{
    static int i = 1;
    private String ma, ten, dvi;
    private int gia, soluong;
    public MatHang(String ten, String dvi, int gia, int soluong){
        this.ma = "MH" + String.format("%02d", i++);
        this.ten = ten;
        this.dvi = dvi;
        this.gia = gia;
        this.soluong = soluong;
    }
    public double Phi(){
        double phi = Math.round((gia * soluong) * 5 / 100);
        return phi;
    }
    public double total(){
        double total = Math.round((gia * soluong) + Phi());
        return total;
    }
    public double ThanhTien(){
        double y = Math.round(total() + total() * 0.02);
        return y;
    }
    public String toString(){
        String x = Phi() + "";
        String y = total() + "";
        String z = ThanhTien() + "";
        if(Phi() -(int)Phi() == 0){
            
        }
        return ma + " " + ten + " " + dvi + " " + (long)Phi() + " " + (long)total() + " " + (long)ThanhTien();
    }
}
public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<MatHang>();
        while(t-- > 0){
            MatHang mh = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            list.add(mh);
        }
        for(MatHang mh : list){
            System.out.println(mh);
        }
    }
}
