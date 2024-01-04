import java.util.*;

public class J03008 {
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int ok = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(s.length() - 1 - i) || snt(s.charAt(i) - '0') == false){
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

