import java.util.*;
import java.io.*;
import java.text.*;


class KhachHang{
    public static int i = 1;
    private String ma, name;
    private String num;
    private Date nhan, tra;
    private int tien;
    public KhachHang(String name, String num, String nhan, String tra, int tien) throws ParseException{
        this.ma = "KH" + String.format("%02d", i++);
        this.name = name;
        this.num = num;
        this.nhan = new SimpleDateFormat("dd/MM/yyyy").parse(chuanHoa1(nhan.trim()));
        this.tra = new SimpleDateFormat("dd/MM/yyyy").parse(chuanHoa1(tra.trim()));
        this.tien = tien;
    }
    public long getTime(){
        long k = tra.getTime() - nhan.getTime();
        long x = k /(24 * 60 * 60 * 1000) + 1;
        return x; 
    }
    public long getGia(){
        int x = Integer.parseInt(num.substring(0, 1));
        if(x == 1){
            return 25;
        }
        else if(x == 2){
            return 34;
        }
        else if(x == 3){
            return 50;
        }
        else{
            return 80;
        }
    }
    public String chuanHoa1(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/'){
            sb.insert(0, '0');
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, '0');
        }
        return sb.toString();
    }
    public String chuanHoa(){
        name = name.trim();
        String[] arr = name.split("\\s+");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += Character.toUpperCase(arr[i].charAt(0));
            for(int j = 1; j < arr[i].length(); j++){
                res += Character.toLowerCase(arr[i].charAt(j));
            }
            res += " ";
        }
        name = res.trim();
        return name;
    }
    public long Sum(){
        long x = getTime() * getGia() + tien;
        return x;
    }
    public String toString(){
        return ma + " " + name + " " + num.trim() + " " + getTime() + " " + Sum();
    }
}
public class J07051 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<KhachHang> lists = new ArrayList<KhachHang>();
        while(t-- > 0){
            String name = sc.nextLine();
            String num = sc.nextLine();
            String nhan = sc.nextLine();
            String tra = sc.nextLine();
            String tien1 = sc.nextLine();
            int tien = Integer.parseInt(tien1);
            KhachHang k = new KhachHang(name, num, nhan, tra, tien);
            k.chuanHoa();
            lists.add(k);
        }
        lists.sort((s1, s2) -> Long.compare(s2.Sum(), s1.Sum()));
        for(KhachHang k : lists) {
            System.out.println(k);
        }
        sc.close();
    }
}