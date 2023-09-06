import java.lang.reflect.Array;
import java.util.*;

public class J08015 {
    public static int find_first(int[] a, int l, int r, long k){
        int res = -1;
        while(l <= r){
            int mid= (l + r) / 2;
            if(a[mid] == k){
                res = mid;
                r = mid - 1;
            }
            else if(a[mid] > k){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
    }
    public static int find_last(int[] a, int l, int r, long k){
        int res = -1;
        while(l <= r){
            int mid= (l + r) / 2;
            if(a[mid] == k){
                res = mid;
                l = mid + 1;
            }
            else if(a[mid] > k){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            long cnt = 0;
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                int x1 = find_first(a, i + 1, n - 1, k - a[i]);
                int x2 = find_last(a, i + 1, n - 1, k - a[i]);
                if(x2 != -1){
                    cnt += x2 - x1 + 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
