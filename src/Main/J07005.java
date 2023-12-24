import java.util.ArrayList;
import java.util.*;
import java.io.ObjectInputStream;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class J07005{
    public static void main(String[] args) {
        try{
            FileInputStream inputStream = new FileInputStream("DATA.in");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ArrayList<Integer> arr = (ArrayList<Integer>) objectInputStream.readObject();
            Map<Integer, Integer> h = new TreeMap<Integer, Integer>();
            for(Integer s : arr) {
                if(h.containsKey(s)){
                    int ts = h.get(s);
                    ts++;
                    h.put(s, ts);
                }
                else{
                    h.put(s, 1);
                }
            }
            objectInputStream.close();
            for(Map.Entry<Integer, Integer> e : h.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}