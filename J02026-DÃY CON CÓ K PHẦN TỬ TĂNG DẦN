import java.util.Arrays;
import java.util.Scanner;

public class J02026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[k + 1];
            int[] b = new int[n + 1];
            for (int i = 1; i <= n; i++)
                b[i] = sc.nextInt();
            Arrays.sort(b, 1, n + 1);
            for (int i = 1; i <= k; i++)
                a[i] = i;
            while (true) {
                for (int i = 1; i <= k; i++){
                    System.out.print(b[a[i]] + " ");
                }
                System.out.println();
                int ok = 0;
                for (int i = k; i >= 1; i--) {
                    if (a[i] != n - k + i) {
                        ok = 1;
                        a[i]++;
                        for (int j = i + 1; j <= k; j++)
                            a[j] = a[j - 1] + 1;
                        break;
                    }
                }
                if (ok == 0)
                    break;
            }
        }
    }
}
