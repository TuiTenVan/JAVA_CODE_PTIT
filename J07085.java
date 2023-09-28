import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085 {
    public static void main(String[] args){
        try{
            FileInputStream in = new FileInputStream("DATA.in");
            ObjectInputStream o = new ObjectInputStream(in);
            ArrayList<String> list = (ArrayList<String>) o.readObject();
            for (String s : list) {
                String res = "";
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isDigit(s.charAt(i))) {
                        res += s.charAt(i);
                    }
                }
                if (!res.isEmpty()) { 
                    BigInteger ans = new BigInteger(res + ""); 
                    long sum = 0;
                    for(int i = 0; i < res.length(); i++) {
                        sum += res.charAt(i) - '0';
                    }
                    System.out.println(ans + " " + sum);
                }
            }
            o.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
