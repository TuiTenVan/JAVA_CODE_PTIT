import java.util.*;

public class J02024 {
    static int n;
    static int[] a = new int[200000];
    static List<Integer> x = new ArrayList<>();
    static List<List<Integer>> ans = new ArrayList<>();
    static Map<List<Integer>, Integer> m = new HashMap<>();

    static void Try(int k, int s) {
        for (int i = k + 1; i <= n; i++) {
            Try(i, s);
            x.add(a[i]);
            if ((s + a[i]) % 2 == 1 && !m.containsKey(x)) {
                m.put(new ArrayList<>(x), 1);
                ans.add(new ArrayList<>(x));
            }
            Try(i, s + a[i]);
            x.remove(x.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ans.clear();
            m.clear();
            n = sc.nextInt();
            for (int i = 1; i <= n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a, 1, n + 1);
            for (int i = 1; i <= n / 2; i++) {
                int temp = a[i];
                a[i] = a[n - i + 1];
                a[n - i + 1] = temp;
            }
            Try(0, 0);

            for (List<Integer> subarr : ans) {
                for (int num : subarr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}