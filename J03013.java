import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            String x = arr[0];
            String y = "";
            if(arr.length == 1){
                y = sc.nextLine();
            }
            else if(arr.length == 2){
                y = arr[1];
            }
            int k = Math.max(x.length(), y.length());
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            BigInteger absoluteDifference = a.subtract(b).abs();
            String result = absoluteDifference.toString();
            while(result.length() < k){
                    result = "0" + result;
            }
            System.out.println(result); 
        }
    }
}
