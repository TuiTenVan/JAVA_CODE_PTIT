import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            if (res.length() == 0 || cur >= res.charAt(0)) {
                res = cur + res;
            }
        }
        System.out.println(res);
    }

}
