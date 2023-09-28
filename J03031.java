import java.util.*;

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            HashSet<Character> set = new HashSet<Character>();
            String s = sc.nextLine();
            int k = sc.nextInt();
            sc.nextLine();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            if(26 - set.size() <= k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
