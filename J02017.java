import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            if(!stack.isEmpty() && (a[i] + stack.peek()) % 2 == 0) {
                stack.pop();
            }
            else
                stack.push(a[i]);
        }
        System.out.println(stack.size());
    }
}
