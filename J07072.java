import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class J07072 {
    public static String ChuanHoa(String s){
        String res = "";
        s = s.toLowerCase();
        String[] arr = s.split("\\s+");
        for(int i = 0; i < arr.length; i++){
            res += Character.toUpperCase(arr[i].charAt(0));
            for(int j = 1; j < arr[i].length(); j++){
                res += arr[i].charAt(j);
            }
            res += " "; 
        }
        return res;
    }
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<String> list = new ArrayList<String>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            list.add(ChuanHoa(s));
        }
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                String[] x = a.split("\\s+");
                String[] y = b.split("\\s+");
                if(x[x.length - 1].equals(y[y.length - 1])){
                    if(x[0].equals(y[0])){
                        return x[1].compareTo(y[1]);
                    }
                    else{
                        return x[0].compareTo(y[0]);
                    }
                }
                else{
                    return x[x.length - 1].compareTo(y[y.length - 1]);
                }
            }
        });
        for(String s : list) {
            System.out.println(s);
        }
    }
}
