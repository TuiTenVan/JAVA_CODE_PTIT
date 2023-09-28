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
public class J05025{
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
        list.sort((s1,s2) ->  {
            if(s1.getName().equals(s2.getName())){
                return s1.getMa().compareTo(s2.getMa());
            }
            else{
                return s1.getName().compareTo(s2.getName());
            }
        });
        for(GiangVien g : list){
            System.out.println(g);
        }
    }
}
