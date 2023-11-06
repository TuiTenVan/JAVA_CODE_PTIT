import java.util.*;

class LoHang{
    private String ten;
    private int SoLuong, DonGia;
    public LoHang(String ten, int SoLuong, int DonGia){
        this.ten = ten;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }
    public String getTen(){
        return ten;
    }
    public String getMa(){
        String res = "";
        String[] arr = ten.split("\\s+");
        for(int i = 0; i < 2; i++){
            res += Character.toUpperCase(arr[i].charAt(0));
        }
        return res;
    }
    public int Tien(){
        return SoLuong * DonGia;
    }
    public int TienChietKhau() {
        if(SoLuong > 10){
            return Tien() * 5 / 100;
        }
        else if(SoLuong >= 8){
            return Tien() * 2 / 100;
        }
        else if(SoLuong >= 5){
            return Tien() * 1 / 100;
        }   
        else{
            return 0;
        }
    }
    public long ThanhTien(){
        return SoLuong * DonGia - TienChietKhau();
    }
    public String toString(){
        return ten + " " + TienChietKhau() + " " + ThanhTien();
    }
}
public class J05046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> mp = new HashMap<String, Integer>();
        Map<String, LoHang> ans = new LinkedHashMap<>();
        while(t-- > 0){
            LoHang l =  new LoHang(sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
            if(mp.containsKey(l.getMa())){
                int ts = mp.get(l.getMa());
                ts++;
                mp.put(l.getMa(), ts);
            }
            else{
                mp.put(l.getMa(),1);
            }
            String res = l.getMa() + String.format("%02d", mp.get(l.getMa()));
            ans.put(res, l);
        }   
        for(Map.Entry<String, LoHang> e : ans.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}