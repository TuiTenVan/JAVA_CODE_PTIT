import java.util.*;

public class MatHang {
    private static int i = 1;
    private String ma, ten, loai;
    private int mua, ban;
    public MatHang(String ten, String loai, int mua, int ban) {
        this.ma = "MH" + String.format("%03d", i++);
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
    }
    public String getMa(){
        return ma;
    }
    public int getMua() { 
        return mua;
    }
    public int getBan() { 
        return ban;
    }
    public String toString(){
        return ma + " " + ten + " " + loai + " " + mua + " " + ban + " " + (ban - mua);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> list = new ArrayList<MatHang>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String ten = sc.nextLine();
            String loai = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            sc.nextLine();
            MatHang x = new MatHang(ten, loai, mua, ban);
            list.add(x);
        }
        Collections.sort(list, new Comparator<MatHang>() {
            public int compare(MatHang a, MatHang b) {
                int x = a.getBan() - a.getMua();
                int y = b.getBan() - b.getMua();
                if(y == x){
                    return a.getMa().compareTo(b.getMa());
                }
                else{
                    return y - x;
                }
            }
        });
        for(MatHang x : list){
            System.out.println(x);
        }
    }
}
