import java.util.*;

class ClassGiangVien{
    static int i = 1;
    private String ma, name, khoa;
    public ClassGiangVien(String name, String khoa){
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
    public String name(){
        return name;
    }
    public String getName(){
        String[] arr = name.split("\\s+");
        return arr[arr.length-1];
    }
    public String toString(){
        return ma + " " + name + " " + getKhoa();
    }
}
public class J05027{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ClassGiangVien> list = new ArrayList<ClassGiangVien>();
        while(t-- > 0){
            String name = sc.nextLine().trim();
            String khoa = sc.nextLine().trim();
            ClassGiangVien g = new ClassGiangVien(name, khoa);
            list.add(g);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine().trim();
            String res = s.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(ClassGiangVien g : list){
                String x = g.name().toLowerCase();
                if(x.contains(res)){
                    System.out.println(g);
                }
            }
        }
    }
}
