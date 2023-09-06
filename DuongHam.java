import java.util.Scanner;
import java.util.Stack;

public class DuongHam {
    public static int[] check = new int[1000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Stack<Integer> vao = new Stack<>();
        Stack<Integer> ra = new Stack<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            vao.push(a[i]);
            ra.push(b[i]);
        }

        int ans = 0;
        while (!vao.isEmpty() && !ra.isEmpty()) {
            if (vao.peek() == ra.peek()) {
                vao.pop();
                ra.pop();
            } else {
                if (check[vao.peek()] == 1) {
                    vao.pop();
                } else {
                    check[ra.peek()] = 1;
                    ra.pop();
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
