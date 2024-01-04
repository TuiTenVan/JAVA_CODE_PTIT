import java.util.*;

public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int ok = 0;
            for(int i = 0; i < s.length(); i++){
                if((s.charAt(i) - '0') % 2 != 0 || s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    ok = 1;
                    break;
                }
            }
            if(ok == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
