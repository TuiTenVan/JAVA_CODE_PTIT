import java.util.*;
import java.util.Map.Entry;

class SapXepLoHang{
    private String ten;
    private int SoLuong, DonGia;
    public SapXepLoHang(String ten, int SoLuong, int DonGia){
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
public class J05047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> mp = new HashMap<String, Integer>();
        Map<String, SapXepLoHang> ans = new LinkedHashMap<>();
        while(t-- > 0){
            SapXepLoHang l =  new SapXepLoHang(sc.nextLine(), sc.nextInt(), sc.nextInt());
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
        List<Map.Entry<String, SapXepLoHang>> tmp = new ArrayList<>(ans.entrySet());
        tmp.sort((entry1, entry2) -> entry2.getValue().TienChietKhau() - entry1.getValue().TienChietKhau());
        for(Entry<String, SapXepLoHang> l : tmp){
            System.out.println(l.getKey() + " " + l.getValue());
        }
    }
}