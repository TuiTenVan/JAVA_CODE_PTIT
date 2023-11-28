import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            int ok = 0;
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '0'){
                    ok = 1;
                    break;
                }
            }
            if(ok == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
