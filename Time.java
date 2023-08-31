import java.util.List;
import java.util.*;

public class Time {
    private int gio, phut, giay;
    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int getGio() {
        return gio;
    }
    public int getPhut() {
        return phut;
    }
    public int getGiay() {
        return giay;
    }
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Time> list = new ArrayList<>();
        while(t-- > 0) {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            Time x = new Time(gio, phut, giay);
            list.add(x);
        }
        Collections.sort(list, new Comparator<Time>() {
            public int compare(Time a, Time b){
                if(a.getGio() == b.getGio()){
                    if(a.getPhut() == b.getPhut()){
                        return a.getGiay() - b.getGiay();
                    }
                    else{
                        return a.getPhut() - b.getPhut();
                    }
                }
                return a.getGio() - b.getGio();
            }
        });
        for(Time x : list){
            System.out.println(x);
        }
    }
}
