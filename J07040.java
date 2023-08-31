import java.io.ObjectInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) {
        try{
            FileInputStream in1 = new FileInputStream("NHIPHAN.in");
            ObjectInputStream o1 = new ObjectInputStream(in1);
            ArrayList<String> list1 = (ArrayList<String>) o1.readObject();
            Scanner sc = new Scanner(new File("VANBAN.in"));
            Set<String> set = new HashSet<String>();
            Set<String> set2 = new LinkedHashSet<String>();
            for(String s : list1) {
                String[] words = s.toLowerCase().split("\\s+");
                for(String word : words) {
                    set.add(word);
                }
            }
            while(sc.hasNext()) {
                String s = sc.next().toLowerCase();
                if(set.contains(s)){
                    set2.add(s);
                }
            }
            for(String word : set2){
                System.out.println(word);
            }
            o1.close();
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}