import java.util.Scanner;
import java.util.Stack;

public class BienBao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int k = sc.nextInt();
        Stack<Character> st = new Stack<>();

        for (char digit : number.toCharArray()) {
            while (k > 0 && !st.isEmpty() && st.peek() < digit) {
                st.pop();
                k--;
            }
            st.push(digit);
        }

        StringBuilder result = new StringBuilder();
        while (k > 0) {
            st.pop();
            k--;
        }

        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }

        System.out.println(result);
    }
}
