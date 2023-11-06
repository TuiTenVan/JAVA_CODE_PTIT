package ThucHanh_OOP_buoi_01;

import java.util.*;
import java.io.*;

public class Bai7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        long ans = 0L;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                Integer.parseInt(s);
            }
            catch(Exception e){
                try{
                    ans += Long.parseLong(s);
                }
                catch(Exception e1){
                    continue;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
