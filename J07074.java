import java.io.File;
import java.util.*;

class HocPhan {
    static int i = 1;
    private String ma, maMon, day, name, phong;
    private int kip;

    public HocPhan(String maMon, String day, int kip, String name, String phong) {
        this.ma = "HP" + String.format("%03d", i++);
        this.maMon = maMon;
        this.day = day;
        this.name = name;
        this.phong = phong;
        this.kip = kip;
    }

    public String getDay() {
        return day;
    }

    public int getKip() {
        return kip;
    }

    public String getMaMon() {
        return maMon;
    }

    public String toString() {
        return ma + " " + day + " " + kip + " " + name + " " + phong;
    }
}

class CheckMonHoc {
    private String maMon, tenMon;
    private int tinchi;

    public CheckMonHoc(String maMon, String tenMon, int tinchi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinchi = tinchi;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getMaMon() {
        return maMon;
    }
}

public class J07074 {

    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));

        int n = Integer.parseInt(sc1.nextLine());
        List<CheckMonHoc> lst = new ArrayList<>();
        while (n-- > 0) {
            String maMon = sc1.nextLine();
            String tenMon = sc1.nextLine();
            int tinchi = Integer.parseInt(sc1.nextLine());
            CheckMonHoc m = new CheckMonHoc(maMon, tenMon, tinchi);
            lst.add(m);
        }

        int m = Integer.parseInt(sc2.nextLine()); 
        List<HocPhan> list = new ArrayList<HocPhan>();
        while (m-- > 0) {
            String maMon = sc2.nextLine();
            String day = sc2.nextLine();
            int kip = Integer.parseInt(sc2.nextLine());
            String name = sc2.nextLine();
            String phong = sc2.nextLine();
            list.add(new HocPhan(maMon, day, kip, name, phong));
        }

        list.sort((s1, s2) -> {
            if (s1.getDay().equals(s2.getDay())) {
                return s1.getKip() - s2.getKip();
            } else {
                return s1.getDay().compareTo(s2.getDay());
            }
        });

        String s = sc2.nextLine();
        List<HocPhan> list2 = new ArrayList<HocPhan>();
        for (HocPhan h : list) {
            if (h.getMaMon().equals(s)) {
                list2.add(h);
            }
        }

        String res = "";
        for (CheckMonHoc mh : lst) {
            if (mh.getMaMon().equals(s)) {
                res = mh.getTenMon();
            }
        }

        System.out.println("LICH GIANG DAY MON " + res + ":");
        for (HocPhan h : list2) {
            System.out.println(h);
        }

        sc1.close();
        sc2.close();
    }
}
