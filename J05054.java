import java.util.*;

class XepHangHocSinh{
    private String ma, name;
    private double dtb;
    static int i = 1;
    public XepHangHocSinh(String name, double dtb) {
        this.ma = "HS" + String.format("%02d", i++);
        this.name = name;
        this.dtb = dtb;
    }
    public Double getDTB(){
        return dtb;
    }
    public String XepHang(){
        if(dtb < 5){
            return "Yeu";
        }
        else if(dtb < 7){
            return "Trung Binh";
        }
        else if(dtb < 9){
            return "Kha";
        }
        else{
            return "Gioi";
        }
    }
    public String toString(){
        return ma + " " + name + " " + String.format("%.01f", dtb) + " " + XepHang() + " ";
    }
}
public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<XepHangHocSinh> list = new ArrayList<XepHangHocSinh>();
        while(t-- > 0) {
            String name = sc.nextLine();
            Double dtb = Double.parseDouble(sc.nextLine());
            list.add(new XepHangHocSinh(name, dtb));
        }
        List<XepHangHocSinh> ans = new ArrayList<XepHangHocSinh>(list);
        ans.sort((s1, s2) -> Double.compare(s2.getDTB(), s1.getDTB()));
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        for(int i = 0; i < ans.size(); i++){
            if(!map.containsKey(ans.get(i).getDTB())){
                map.put(ans.get(i).getDTB(), i + 1);
            }
        }
        for(int i = 0; i < list.size(); i++){
            for(Map.Entry<Double, Integer> e : map.entrySet()){
                if(Double.compare(e.getKey(),list.get(i).getDTB()) == 0){
                    System.out.println(list.get(i) + " " + e.getValue());
                    break;
                }
            }
        }
    }
}
