package KTraGiuaTri;
import java.io.File;
import java.util.Scanner;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> se = new TreeSet<String>();
        while(sc.hasNextLine()){
            String[] arr = sc.nextLine().split(" ");
            for(String i : arr){
                if(!i.equals("")){
                    boolean ok = false;
                    for(int j = 0; j < i.length(); j++){
                        if(i.charAt(j) >= '0' && i.charAt(j) <= '9'){
                            ok = true;
                        }
                        else if(i.charAt(j) == '.' || i.charAt(j) == ',' || i.charAt(j) == '!' || i.charAt(j) == '?' || i.charAt(j) == ':'){
                            ok = false;
                            break;
                        }
                    }
                    if(ok){
                        se.add(i);
                    }
                }
            }
        }
        for(String i : se){
            System.out.println(i);
        }
    }
}
