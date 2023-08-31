import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class J07029 {
    public static boolean Snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try{
            FileInputStream in = new FileInputStream("DATA.in");
            ObjectInputStream o = new ObjectInputStream(in);
            ArrayList<Integer> list = (ArrayList<Integer>) o.readObject();
            Map<Integer, Integer> mp = new HashMap<>();
            for(Integer i : list){
                if(Snt(i)){
                    if(mp.containsKey(i)){
                        int ts = mp.get(i);
                        ts++;
                        mp.put(i, ts);
                    }
                    else{
                        mp.put(i, 1);
                    }
                }
            }
             ArrayList<Map.Entry<Integer, Integer>> l = new ArrayList<>(mp.entrySet());
            Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b){
                    return b.getKey().compareTo(a.getKey());
                }
            });
            int cnt = 0;
            for(Map.Entry<Integer, Integer> entry : l){
                if(cnt >= 10){
                    break;
                }
                System.out.println(entry.getKey() + " " + entry.getValue());
                cnt++;
            }
            o.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}