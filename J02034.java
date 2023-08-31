import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = a[n - 1];
        List<Integer> h = new ArrayList<Integer>();
        for (int i = 1; i <= x; i++) {
            h.add(i);
        }
        List<Integer> list = new ArrayList<Integer>();
        int l = 0, r = 0;
        while (r < n && l < h.size()) {
            if (a[r] == h.get(l)) {
                r++;
                l++;
            } else if (a[r] > h.get(l)) {
                list.add(h.get(l));
                l++;
            }
        }
        if (h.size() == n) {
            System.out.println("Excellent");
        } else {
            for (int k : list) {
                System.out.println(k + " ");
            }
        }
    }
}
