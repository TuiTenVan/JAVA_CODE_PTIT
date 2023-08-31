import java.io.File;
import java.util.List;
import java.util.*;

public class MonHoc {
    private String ma, ten;
    private int tinchi;
    public MonHoc(String ma, String ten, int tinchi){
        this.ma = ma;
        this.ten = ten;
        this.tinchi = tinchi;
    }
    public String getTen(){
        return this.ma;
    }
    public String toString() {
        return ma + " " + ten + " " + tinchi;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<MonHoc> lists = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String tinchi1 = sc.nextLine();
            int tinchi = Integer.parseInt(tinchi1);
            MonHoc m = new MonHoc(ma, ten, tinchi);
            lists.add(m);
        }
        Collections.sort(lists, new Comparator<MonHoc>() {
            public int compare(MonHoc a, MonHoc b){
                return a.getTen().compareTo(b.getTen());
            }
        });
        for(MonHoc m : lists){
            System.out.println(m);
        }
        sc.close();
    }
}
