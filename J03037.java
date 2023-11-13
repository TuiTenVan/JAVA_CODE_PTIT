import java.util.Scanner;

public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = countIntersections(s);
        System.out.println(ans);
    }

    public static int countIntersections(String s) {
        int[] a = new int[128];
        int[] b = new int[128];
        int[] check = new int[128];
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (check[c] == 0) {
                a[c] = i;
                check[c] = 1;
            } else {
                b[c] = i;
            }
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                if (a[i] < a[j] && a[j] < b[i] && b[j] > b[i]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
