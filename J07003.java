import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger n = sc.nextBigInteger();
        while(true){
            String s = n.toString();
            if(s.length() == 1){
                break;
            }
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length() / 2);
            BigInteger x1 = new BigInteger(s1);
            BigInteger x2 = new BigInteger(s2);
            n = x1.add(x2);
            System.out.println(n);
        }
        sc.close();
    }
}