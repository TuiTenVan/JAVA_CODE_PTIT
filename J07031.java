import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class J07031 {
    public static boolean snt(int n){
        if(n < 2 ) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        FileInputStream in1 = new FileInputStream("DATA1.in");
        FileInputStream in2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(in1);
        ObjectInputStream o2 = new ObjectInputStream(in2);
        ArrayList<Integer> list1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) o2.readObject();
        Set<Integer> set = new TreeSet<Integer>();
        for(Integer i : list1){
            if(snt(i)){
                set.add(i);
            }
        }
        for(Integer i : set){
            if(i >= 1000000 - i){
                break;
            }
            if(set.contains(1000000 - i) && !list2.contains(1000000 - i) && !list2.contains(i)){
                System.out.println(i + " " + (1000000 - i));
            }
        }
        o1.close();
        o2.close();
    }
}
