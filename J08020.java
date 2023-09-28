import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            int ok = 0;
            Stack<Character> st = new Stack<>();
            for(int i =0; i < s.length(); i++) {
                if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                    st.push(s.charAt(i));
                }
                else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'){
                    if(st.isEmpty()){
                        ok = 1;
                        break;
                    }
                    else {
                        if(s.charAt(i) == '}' && st.peek() == '{'){
                            st.pop();
                        }
                        else if(s.charAt(i) == ']' && st.peek() == '['){
                            st.pop();
                        }
                        else if(s.charAt(i) == ')' && st.peek() == '('){
                            st.pop();
                        }
                        else{
                            ok = 1;
                            break;
                        }
                    }
                }
            }
            if(st.isEmpty() && ok == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
