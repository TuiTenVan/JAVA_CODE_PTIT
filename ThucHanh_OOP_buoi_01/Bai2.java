import java.io.File;
import java.util.*;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            String x = "";
            String y = "";
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0){
                    x += a[i];
                }
                else {
                    y += a[i];
                }
            }
            Long ans = Long.parseLong(x) + Long.parseLong(y);
            System.out.println(ans);
        }
        sc.close();
    }
}
