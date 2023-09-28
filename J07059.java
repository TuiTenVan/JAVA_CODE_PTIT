import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class DanhSach{
    private static int i = 1;
    private String ma;
    private Date day1;
    private String day;
    private String time;
    private String phong;
    public DanhSach(String day, String time, String phong) throws ParseException{
        this.ma = "C" + String.format("%03d", i++);
        this.time = time;
        this.phong = phong;
        this.day = day;
        this.day1 = new SimpleDateFormat("dd/MM/yyyy").parse(day);
    }
    public long getDay(){
        long k = day1.getTime() / (60 * 60 * 24 * 1000);
        return k;
    }
    public int totalTime(){
        int x = Integer.parseInt(time.substring(0, 2));
        int y = Integer.parseInt(time.substring( 3));
        int total = x * 60 + y;
        return total;
    }
    public String toString() {
        return ma + " " + day + " " + time + " " + phong;
    }
}
public class J07059 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        List<DanhSach> list = new ArrayList();
        while(n-- > 0){
            String day = sc.nextLine();
            String time = sc.nextLine();
            String phong = sc.nextLine();
            DanhSach d = new DanhSach(day, time, phong);
            list.add(d);
        }
        list.sort((s1,s2) -> {
            if(s1.getDay() == s2.getDay()){
                return s1.totalTime() - s2.totalTime();
            }
            else{
                return Long.compare(s1.getDay(), s2.getDay());
            }
        });
        for(DanhSach d : list) {
            System.out.println(d);
        }
    }
}
