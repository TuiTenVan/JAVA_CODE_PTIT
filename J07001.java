import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07001{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}