import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07023 {
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean check(int n){
        int m = n;
        int dao = 0;
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
    public static void main(String[] args) throws Exception {
        FileInputStream in1 = new FileInputStream("DATA1.in");
        ObjectInputStream o1 = new ObjectInputStream(in1);
        ArrayList<Integer> list = (ArrayList<Integer>) o1.readObject();
        int[] a = new int[10000];
        int[] b = new int[10000];
        for(Integer i : list) {
            if(snt(i) && check(i)){
                a[i]++;
            }
        }
        FileInputStream in2 = new FileInputStream("DATA2.in");
        ObjectInputStream o2 = new ObjectInputStream(in2);
        ArrayList<Integer> list1 = (ArrayList<Integer>) o2.readObject();
        for(Integer i : list1) {
            if(snt(i) && check(i)){
                b[i]++;
            }
        }
        for(int i = 0; i < 10000; i++) {
            if(a[i] > 0 || b[i] > 0) {
                System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }
    }
}
