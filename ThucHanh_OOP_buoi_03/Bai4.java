package ThucHanh_OOP_buoi_03;

import java.io.File;
import java.util.*;

class ICPC{
    private String tenTat, tenTruong, tenTeam;
    public ICPC(String tenTat, String tenTeam, String tenTruong){
        this.tenTat = tenTat;
        this.tenTruong = tenTruong;
        this.tenTeam = tenTeam;
    }
    public String tenTat(){
        return tenTat;
    }
    public String tenTruong(){
        return tenTruong;
    }
    public String tenTeam(){
        return tenTeam;
    }
    public String toString(){
        return " " + tenTeam + " " + tenTruong;
    }
}

public class Bai4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < n; i++) {
            String tenTat = sc.next();
            String tenTruong = sc.nextLine().trim();
            map.put(tenTat, tenTruong);
        }
        sc = new Scanner(new File("REGISTER.in")); 
        int m = Integer.parseInt(sc.nextLine());
        List<ICPC> list = new ArrayList<ICPC>();
        for(int i = 0; i < m; i++) {
            String s = sc.nextLine().trim();
            String[] arr = s.split("\\s+");
            int t = Integer.parseInt(arr[1]);
            for(int j = 0; j < t; j++) {
                String tenTeam = sc.nextLine().trim();
                String k = tenTeam.substring(0, 3);
                for(Map.Entry<String, String> entry : map.entrySet()) {
                    if(entry.getKey().equals(k)){
                        list.add(new ICPC(entry.getKey(), tenTeam, entry.getValue()));
                        break;
                    }
                }
            }
        }
        list.sort((s1,s2) -> {
            if(s1.tenTruong().equals(s2.tenTruong())){
                return s1.tenTeam().compareTo(s2.tenTeam());
            }
            else{
                return s1.tenTruong().compareTo(s2.tenTruong());
            }
        });
        int index = 1;
        for(ICPC l : list) {
            System.out.print("team" + String.format("%02d", index++));
            System.out.println(l);
        }
    }
}
