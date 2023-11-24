import java.util.Scanner;
import java.util.Stack;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '-') {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            } else if (c == '<') {
                if (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            } else if (c == '>') {
                if (!st2.isEmpty()) {
                    st1.push(st2.pop());
                }
            } else {
                st1.push(c);
            }
        }
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        StringBuilder result = new StringBuilder();
        while (!st1.isEmpty()) {
            result.append(st1.pop());
        }
        System.out.println(result.reverse().toString());
    }
}
