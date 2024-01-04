import java.util.*;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    b[i][j] =a[j][i];
                }
            }
            for(int i = 0; i < n; i++){
                for(int k = 0; k < n; k++){
                    for(int j = 0; j < m; j++){
                        c[i][k] += a[i][j] * b[j][k];
                    }   
                }
            }
            System.out.println("Test " + (x + 1) + ":");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
