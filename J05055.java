import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class VDV{
    private String ma, name, birth;
    private Date start, end;
    static int i = 1;
    public VDV(String name, String birth, String start, String end) throws ParseException {
        this.ma = "VDV" + String.format("%02d", i++);
        this.name = name;
        this.birth = birth;
        this.start = new SimpleDateFormat("HH:mm:ss").parse(start);
        this.end = new SimpleDateFormat("HH:mm:ss").parse(end);
    } 
    public int Tuoi(){
        int nam = Integer.parseInt(birth.substring(6));
        int tuoi = 2021 - nam;
        if(tuoi < 18){
            return 0;
        }
        else if(tuoi < 25){
            return 1;
        }
        else if(tuoi < 32){
            return 2;
        }
        else{
            return 3;
        }
    }
    public String UuTien(){
        long x = Tuoi() * 1000;
        Date date = new Date(x);
        SimpleDateFormat dateFormat = new SimpleDateFormat("00:mm:ss");
        return dateFormat.format(date);
    }
    public String TimeThucte(){
        long x = (end.getTime() - start.getTime());
        Date date = new Date(x);
        SimpleDateFormat dateFormat = new SimpleDateFormat("00:mm:ss");
        return dateFormat.format(date);
    }
    public String ThanhTich(){
        long x = (end.getTime() - start.getTime()) - Tuoi() * 1000;
        Date date = new Date(x);
        SimpleDateFormat dateFormat = new SimpleDateFormat("00:mm:ss");
        return dateFormat.format(date);
    }
    public String toString(){
        return ma + " " + name + " " + TimeThucte() + " " + UuTien() + " " + ThanhTich();
    }
}
public class J05055 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<VDV> list = new ArrayList<VDV>();
        while(t-- > 0){
            String name = sc.nextLine();
            String birth = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            list.add(new VDV(name, birth, start, end));
        }
        List<VDV> ans = new ArrayList<>(list);
        ans.sort((s1,s2) -> s1.ThanhTich().compareTo(s2.ThanhTich()));
        Map<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < ans.size(); i++){
            if(!map.containsKey(ans.get(i).ThanhTich()))
                map.put(ans.get(i).ThanhTich(), i + 1);
        }
        for(int i = 0; i < list.size(); i++){
            for(Map.Entry<String, Integer> e : map.entrySet()){
                if(e.getKey().equals(list.get(i).ThanhTich())){
                    System.out.println(list.get(i) + " " + e.getValue());
                    break;
                }
            }
        }
    }
}
