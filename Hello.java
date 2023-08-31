
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
public class Hello {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("Hello.txt"));
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
