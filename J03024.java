import java.util.*;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int c = 0, l = 0;
            int ok = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) < 48 || s.charAt(i) > 57){
                    ok = 1;
                    break;
                }
                if((int)s.charAt(i) % 2 == 0){
                    c++;
                }
                else{
                    l++;
                }
            }
            if(ok == 1){
                System.out.println("INVALID");
            }
            else{
                if(s.length() % 2 == 0 && c > l){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
