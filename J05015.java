import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class VanToc {
    private String name;
    private String add;
    private String end;
    private String ma;

    public VanToc(String ma, String name, String add, String end) {
        this.ma = ma;
        this.name = name;
        this.add = add;
        this.end = end;
    }

    public String getMa() {
        StringBuilder result = new StringBuilder();
        String[] names = this.name.split("\\s+");
        String[] adds = this.add.split("\\s+");

        for (String item : adds) {
            result.append(item.charAt(0));
        }

        for (String item : names) {
            result.append(item.charAt(0));
        }

        return result.toString();
    }

    public double calc() {
        int gio = Integer.parseInt(this.end.substring(0, 1));
        int phut = Integer.parseInt(this.end.substring(2));
        int x = (gio - 6) * 60 + phut;
        return (120000.0 / x) * 60 / 1000;
    }

    public String toString() {
        return String.format("%s %s %s %d Km/h", this.getMa(), this.name, this.add, Math.round(this.calc()));
    }
}
public class J05015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        List<VanToc> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String add = sc.nextLine();
            String end = sc.nextLine();
            list.add(new VanToc("", name, add, end));
        }

        Collections.sort(list, (v1, v2) -> Double.compare(v2.calc(), v1.calc()));

        for (VanToc vanToc : list) {
            System.out.println(vanToc);
        }
    }
}
