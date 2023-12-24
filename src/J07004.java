import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class J07004{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("C:\\Users\\nguye\\OneDrive\\Documents\\JAVA\\Java_Ptit\\src\\DATA.in"));
            TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
            while(sc.hasNext()){
                int s = sc.nextInt();
                try{
                    if(h.containsKey(s)){
                        int ts = h.get(s);
                        ts++;
                        h.put(s, ts);
                    }
                    else{
                        h.put(s, 1);
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            for(Map.Entry<Integer, Integer> e : h.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue());
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}