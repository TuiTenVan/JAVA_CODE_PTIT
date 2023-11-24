import java.io.File;
import java.util.*;

class ClassHocPhan {
    private String ma, maMon, day, name, phong;
    private int kip;
    static int i = 1;

    public ClassHocPhan(String maMon, String day, int kip, String name, String phong) {
        this.ma = "HP" + String.format("%03d", i++);
        this.maMon = maMon;
        this.day = day;
        this.name = name;
        this.phong = phong;
        this.kip = kip;
    }

    public String getMa() {
        return ma;
    }

    public String getDay() {
        return day;
    }

    public int getKip() {
        return kip;
    }

    public String getName() {
        return name;
    }

    public String getMaMon() {
        return maMon;
    }

    public String toString() {
        return day + " " + kip + " " + phong;
    }
}

class CheckMonHoc {
    private String maMon, tenMon;
    private int tinchi;
    static int i = 1;

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

public class J07075 {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));

        int n = Integer.parseInt(sc1.nextLine());
        List<CheckMonHoc> lst = new ArrayList<>();
        while (n-- > 0) {
            String maMon = sc1.nextLine().trim();
            String tenMon = sc1.nextLine().trim();
            int tinchi = Integer.parseInt(sc1.nextLine());
            CheckMonHoc m = new CheckMonHoc(maMon, tenMon, tinchi);
            lst.add(m);
        }

        int m = Integer.parseInt(sc2.nextLine());
        List<ClassHocPhan> list = new ArrayList<ClassHocPhan>();
        while (m-- > 0) {
            String maMon = sc2.nextLine().trim();
            String day = sc2.nextLine().trim();
            int kip = Integer.parseInt(sc2.nextLine().trim());
            String name = sc2.nextLine().trim();
            String phong = sc2.nextLine().trim();
            list.add(new ClassHocPhan(maMon, day, kip, name, phong));
        }

        list.sort((s1, s2) -> {
            if (s1.getDay().equals(s2.getDay())) {
                return s1.getKip() - s2.getKip();
            } else {
                return s1.getDay().compareTo(s2.getDay());
            }
        });

        String s = sc2.nextLine();
        List<String> list2 = new ArrayList<>();
        List<ClassHocPhan> list1 = new ArrayList<>();
        for (ClassHocPhan h : list) {
            if (s.equals(h.getName())) {
                list1.add(h);
            }
        }
        for (ClassHocPhan h : list1) {
            for (CheckMonHoc c : lst) {
                if (h.getMaMon().equals(c.getMaMon())) {
                    String tmp = h.getMa() + " " + c.getTenMon() + " " + h.toString();
                    list2.add(tmp);
                }
            }
        }

        String res = "";
        for (ClassHocPhan h : list) {
            if (h.getName().equals(s)) {
                res = h.getName();
            }
        }

        System.out.println("LICH GIANG DAY GIANG VIEN " + res + ":");
        for (String h : list2) {
            System.out.println(h);
        }

        sc1.close();
        sc2.close();
    }
}
