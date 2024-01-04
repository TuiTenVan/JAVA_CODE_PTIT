import java.lang.reflect.Array;
import java.util.*;

public class J02027 {
    public static int find(int[] a, int l, int r , long x){
        int res = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] < x){
                res = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            for(int i = 0; i < n; i++){
                int x = find(a, i + 1, n - 1, k + a[i]);
                if(x != -1){
                    ans += x - i;
                }
            }
            System.out.println(ans);
        }
    }
}
