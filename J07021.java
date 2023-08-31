import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class J07021{
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(true){
                String name = sc.nextLine();
                if(name.equals("END")){
                    break;
                }
                name = name.toLowerCase();
                name = name.trim();
                String[] arr = name.split("\\s+");
                String res = "";
                for(int i = 0; i < arr.length; i++){
                    res += Character.toUpperCase(arr[i].charAt(0));
                    for(int j = 1; j < arr[i].length(); j++){
                        res += arr[i].charAt(j);
                    }
                    res += " ";
                }
                res = res.trim();
                System.out.println(res);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}