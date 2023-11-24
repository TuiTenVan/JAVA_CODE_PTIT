package ThucHanh_OOP_buoi_03;

import java.io.File;
import java.util.*;

class Truong implements Comparable<Truong> {
    private String ma, ten;
    public Truong(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    public String getMa() {
        return ma;
    }
    public int compareTo(Truong o) {
        return this.ten.compareTo(o.ten);
    }
    public String toString() {
        return this.ten;
    }
}
class Doi implements Comparable<Doi> {
    private String ten;
    private Truong truong;
    public Doi(String ten, Truong truong) {
        this.ten = ten;
        this.truong = truong;
    }
    public int compareTo(Doi o) {
        if(this.truong.compareTo(o.truong) != 0){
            return this.truong.compareTo(o.truong);
        }
        return this.ten.compareTo(o.ten);
    }
    public String toString(){
        return this.ten + " " + this.truong;
    }
}

public class Bai4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Truong> mapTruong = new HashMap<>();
        for(int i = 0; i < n; i++) {
            Truong x = new Truong(sc.next(), sc.nextLine().trim());
            mapTruong.put(x.getMa(), x);
        }
        sc = new Scanner(new File("REGISTER.in")); 
        int m = Integer.parseInt(sc.nextLine());
        List<Doi> arr = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            Truong x = mapTruong.get(sc.next());
            int t = Integer.parseInt(sc.nextLine().trim());
            for(int j = 0; j < t; j++) {
                arr.add(new Doi(sc.nextLine(), x));
            }
        }
        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i++){
            System.out.println(String.format("team%02d", i + 1) + " " + arr.get(i));
        }
    }
}
