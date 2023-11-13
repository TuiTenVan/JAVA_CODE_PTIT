import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int max_length = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);  

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        max_length = Math.max(max_length, i - stack.peek());
                    } else {
                        stack.push(i);
                    }
                }
            }
            System.out.println(max_length);
        }
    }
}