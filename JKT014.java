import java.util.*;

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            List<Integer> arr = new ArrayList<>();
            List<Integer> ans = new ArrayList<>();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int cnt = 1;
                while (!arr.isEmpty() && a[i] >= arr.get(arr.size() - 1)) {
                    arr.remove(arr.size() - 1);
                    cnt += ans.get(ans.size() - 1);
                    ans.remove(ans.size() - 1);
                }
                arr.add(a[i]);
                ans.add(cnt);
                res.add(cnt);
            }
            
            for (Integer i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
