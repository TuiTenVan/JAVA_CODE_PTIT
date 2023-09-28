import java.util.*;

class GiangVien{
    static int i = 1;
    private String ma, name, khoa;
    public GiangVien(String name, String khoa){
        this.ma = "GV" + String.format("%02d", i++);
        this.name = name;
        this.khoa = khoa;
    }
    public String getKhoa(){
        String k = khoa.toUpperCase();
        String[] arr = k.split("\\s+");
        String res = "";
        for(int  i = 0; i < arr.length; i++){
            res += arr[i].charAt(0);
        }
        return res;
    }
    public String getMa(){
        return ma;
    }
    public String getName(){
        String[] arr = name.split("\\s+");
        return arr[arr.length-1];
    }
    public String toString(){
        return ma + " " + name + " " + getKhoa();
    }
}
public class J05026{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> list = new ArrayList<GiangVien>();
        while(t-- > 0){
            String name = sc.nextLine().trim();
            String khoa = sc.nextLine().trim();
            GiangVien g = new GiangVien(name, khoa);
            list.add(g);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine().trim();
            s = s.toUpperCase();
            String[] arr = s.split("\\s+");
            String res = "";
            for(int i = 0; i < arr.length; i++){
                res += arr[i].charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for(GiangVien g : list){
                if(g.getKhoa().equals(res)){
                    System.out.println(g);
                }
            }
        }
    }
}
