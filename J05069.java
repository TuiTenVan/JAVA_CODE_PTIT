import java.util.*;

class BongDa{
    private String ma, ten, gia;
    public BongDa(String ma, String ten, String gia){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }
    public String getGia(){
        return gia;
    }
    public String toString(){
        return " " + ten + " ";
    }
}
public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<BongDa> list = new ArrayList<BongDa>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String gia = sc.nextLine();
            list.add(new BongDa(ma, ten, gia));
        }
        List<String> ans = new ArrayList<String>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String[] arr = sc.nextLine().split("\\s+");
            String s = arr[0];
            int SoVe = Integer.parseInt(arr[1]);
            String tmp = s.substring(1,3);
            String res = "";
            for(int i = 0; i < list.size(); i++){
                if(tmp.equals(list.get(i).getMa())){
                    res += s + list.get(i).toString() + (long)(SoVe * Integer.parseInt(list.get(i).getGia()));
                    break;
                }
            }
            ans.add(res);
        }
        for(String s : ans){
            System.out.println(s);
        }
    }
}
