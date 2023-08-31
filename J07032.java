import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.*;

public class J07032 {
    public static boolean ThuanNghich(int n){
        int dao = 0;
        int m = n;
        while(m > 0){
            dao = dao * 10 + m % 10;
            m /= 10;
        }
        if(dao == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean check(int n){
        int cnt = 0;
        while(n > 0){
            int r = n % 10;
            cnt ++;
            if(r % 2 == 0){
                return false;
            }
            n /= 10;
        }
        if(cnt > 1 && cnt % 2 != 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        try{
            FileInputStream in1 = new FileInputStream("DATA1.in");
            FileInputStream in2 = new FileInputStream("DATA2.in");
            ObjectInputStream o1 = new ObjectInputStream(in1);
            ObjectInputStream o2 = new ObjectInputStream(in2);
            ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
            ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
            Map<Integer, Integer> map = new TreeMap<>();
            for(Integer x : list1){
                if(ThuanNghich(x) && check(x) && list2.contains(x)){
                    if(map.containsKey(x)){
                        int ts = map.get(x);
                        ts++;
                        map.put(x, ts);
                    }
                    else{
                        map.put(x, 1);
                    }
                }
            }
            for(Integer x : list2){
                if(ThuanNghich(x) && check(x) && list1.contains(x)){
                    if(map.containsKey(x)){
                        int ts = map.get(x);
                        ts ++;
                        map.put(x, ts);
                    }
                    else{
                        map.put(x, 1);
                    }
                }
            }
            int count = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
                count ++;
                if(count >= 10){
                    break;
                }
            }
            o1.close();
            o2.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
