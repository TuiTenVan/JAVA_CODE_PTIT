import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<Integer>();
            int[] ans = new int[n];
            for(int i = n - 1; i >= 0; i--) {
                while(!st.isEmpty() && st.peek() <= a[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[i] = st.peek();
                }
                else{
                    ans[i] = -1;
                }
                st.push(a[i]);
            }
            for(int i : ans){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
