import java.util.*;

class TinhTienDien{
    private String ma, loai;
    static int i = 1;
    private int chisocu, chisomoi;
    public TinhTienDien(String loai, int chisocu, int chisomoi){
        this.ma = "KH" + String.format("%02d", i++);
        this.loai = loai;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }
    public int HeSo(){
        if(loai.equals("KD")){
            return 3;
        }
        else if(loai.equals("NN")){
            return 5;
        }
        else if(loai.equals("TT")){
            return 4;
        }
        else if(loai.equals("CN")){
            return 2;
        }
        else{
            return 0;
        }
    }
    public long ThanhTien(){
        return (chisomoi - chisocu) * HeSo() * 550;
    }
    public long PhuTroi(){
        int x = chisomoi - chisocu;
        if(x < 50){
            return 0;
        }
        else if(x <= 100){
            return (long)Math.ceil(ThanhTien() * 0.35);
        }
        else{
            return ThanhTien();
        }
    }
    public long TongTien(){
        return ThanhTien() + PhuTroi();
    }
    public String toString(){
        return ma + " " + HeSo() + " " + ThanhTien() + " " + PhuTroi() + " " + TongTien();
    }
}
public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TinhTienDien> list = new ArrayList<TinhTienDien>();
        while(t-- > 0){
            String loai = sc.nextLine();
            int chisocu = Integer.parseInt(sc.nextLine());
            int chisomoi = Integer.parseInt(sc.nextLine());
            list.add(new TinhTienDien(loai, chisocu, chisomoi));
        }
        for(TinhTienDien td : list){
            System.out.println(td);
        }
    }
}