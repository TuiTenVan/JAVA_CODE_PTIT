import java.util.*;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            int ok = 0;
            String s = sc.nextLine();
            String res = "";
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9'){
                    ok = 1;
                    break;
                }
                if(s.charAt(i) == '8' || s.charAt(i) == '9'){
                    res += '0';
                }
                else{
                    res += s.charAt(i);
                }
            }
            if(ok == 1){
                System.out.println("INVALID");
            }
            else{
                if(Long.parseLong(res) == 0){
                    System.out.println("INVALID");
                }
                else{
                    System.out.println(Long.parseLong(res));
                }
            }
        }
    }
}
