package ThucHanh_OOP_buoi_03;

import java.util.Scanner;
import java.util.Stack;

public class Bai5 {
    public static long calc(long x, long y, String s){
        if(s.equals("+")) return x + y;
        else if(s.equals("-")) return x - y;
        else if(s.equals("*")) return x * y;
        else return x/y;
    }
    public static boolean check(String s){
        if(s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) 
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            Stack<Long> st = new Stack<Long>();
            for(int i = x.length - 1; i >= 0; i--){
                if(!check(x[i])){
                    st.push(Long.parseLong(x[i]));
                }
                else{
                    long a = st.pop();
                    long b = st.pop();
                    long z = calc(a, b, x[i]);
                    st.push(z);
                }
            }
            System.out.println(st.pop());
        }
    }
}
