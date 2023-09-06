import java.util.*;

public class TichChap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[3][3];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            List<Long> list = new ArrayList<>();
            for(int i = 0; i < n - 2; i++) {
                for(int j = 0; j < m - 2; j++) {
                    long x = 0;
                    for(int k = 0; k < 3; k++) {
                        for(int l = 0; l < 3; l++) {
                            x += b[k][l] * a[k + i][l + j];
                        }
                    }
                    list.add(x);
                }
            }
            long ans = 0;
            for(Long x : list) {
                ans += x;
            }
            System.out.println(ans);
        }
    }
}


