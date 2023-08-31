import java.util.*;
import java.io.*;

public class J07022 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> lines = new ArrayList<String>();
        while(sc.hasNext()) {
            String x = sc.next();
            try{
                Integer.parseInt(x);               
            }
            catch(Exception e){
                lines.add(x);
            }
        }
        Collections.sort(lines);
        for(String line : lines) {
            System.out.print(line + " ");
        }
        sc.close();
    }
}
