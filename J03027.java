import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!st.empty() && st.peek() == (s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.empty()){
            System.out.println("Empty String");
        }
        else{
            for(Character x : st){
                res += x;
            }
            System.out.println(res);
        }
    }
}
