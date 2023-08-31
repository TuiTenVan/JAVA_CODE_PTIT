import java.util.*;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            String x = sc.nextLine();
            if(x.compareTo(s) == 0){
                System.out.println("-1");
            }
            else{
                int k = (int)Math.max(s.length(), x.length());
                System.out.println(k);
            }
        }
    }
}
