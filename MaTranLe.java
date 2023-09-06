import java.util.Scanner;

public class MaTranLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int ok = 0;
            int d = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int sum = 0;
                    for(int k = d; k < d + 1; k++){
                        for(int l = 0; l < d + 1; l++){
                            sum += a[]
                        }
                    }
                }
                d++;
            }
        }
    }
}
