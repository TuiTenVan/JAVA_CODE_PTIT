package ThucHanh_OOP_buoi_02;

import java.io.File;
import java.util.*;

public class Bai4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> lst = new TreeSet<>();
        while (sc.hasNextLine()) {
            for(String i : sc.nextLine().split(" ")){
                if(!i.equals("")){
                    boolean ok = false;
                    for(int j = 0; j < i.length(); j++) {
                        if(i.charAt(j) >= '0' && i.charAt(j) <= '9'){
                            ok = true;
                        }
                        else if(i.charAt(j) == '.' || i.charAt(j) == ',' || i.charAt(j) == '!' || i.charAt(j) == '?' || i.charAt(j) == ':'){
                            ok = false;
                            break;
                        }
                    }
                    if(ok) lst.add(i);
                }
            }
        }
        for(String x : lst){
            System.out.println(x);
        }
    }
}