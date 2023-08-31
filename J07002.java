import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07002{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            long ans = 0;
            while(sc.hasNext()){
                String s = sc.next();
                try{
                    ans += Long.parseLong(s);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println(ans);
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}