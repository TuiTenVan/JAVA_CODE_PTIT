import java.util.*;

public class J02036 {
    public static int gcd(int x, int y) {
        while(y > 0){
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int[] b = new int[n + 1];
            b[0] = a[0];
            for (int i = 1; i < n; i++) {
                b[i] = a[i] * a[i - 1] / gcd(a[i - 1], a[i]);
            }
    
            b[n] = a[n - 1];
            for(int i = 0; i < b.length; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}
