import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

public class J07015 {
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
            FileInputStream in = new FileInputStream("SONGUYEN.in");
            ObjectInputStream o = new ObjectInputStream(in);
            ArrayList<Integer> list = (ArrayList<Integer>) o.readObject();
            TreeMap<Integer, Integer> mp = new TreeMap<>();
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
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());;
            }
            o.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
