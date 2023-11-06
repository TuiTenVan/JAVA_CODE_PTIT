package ThucHanh_OOP_buoi_01;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int[][] d = new int[n + 5][n + 5];
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(s.charAt(i - 1) == s.charAt(j - 1) && i != j){
                        d[i][j] = d[i - 1][j - 1] + 1;
                    }
                    else{
                        d[i][j] = Math.max(d[i - 1][j], d[i][j - 1]);
                    }
                }
            }
            System.out.println(d[n][n]);
        }
    }
}
