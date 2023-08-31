import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int ok = 0;
            for( int i = 1; i < s.length(); i++ ) {
                if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1){
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
