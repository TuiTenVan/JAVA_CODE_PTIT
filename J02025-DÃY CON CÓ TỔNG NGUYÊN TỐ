
import java.util.Scanner;
import java.lang.Math;

public class J02025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            sort(a);
            backtrack(f, 0, n, a);

        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    private static boolean check(int[] f, int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (f[i] == 1)
                sum += a[i];
        }
        if (sum == 2) return true;
        if (sum  < 2 || sum % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(sum);i++)
            if (sum % i == 0) return false;
        return true;
    }

    private static void backtrack(int[] f, int i, int n , int[] a) {
        // Nếu xâu đã đạt được độ dài mong muốn
        if (i == n) {
            if (check(f, a, n)) {
                for (int j = 0; j < n; j++) {
                    if (f[j] == 1){
                        System.out.print(a[j] + " ");
                    }
                }
                System.out.println();
            }
            // System.out.println(Arrays.toString(f));

            return;
        }


        // Thêm giá trị 0 vào xâu
        f[i] = 0;
        backtrack(f, i + 1, n , a);

        // Thêm giá trị 1 vào xâu
        f[i] = 1;
        backtrack(f, i + 1, n , a);
    }
}
