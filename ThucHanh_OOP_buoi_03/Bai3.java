package ThucHanh_OOP_buoi_03;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class Matrix{
    private int n, m;
    private int[][] a;
    public Matrix(int n, int m, int[] arr){
        this.n = n;
        this.m = m;
        int cnt = 0;
        a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                a[i][j] = arr[cnt];
                ++cnt;
            }
        }
    }
    public ArrayList<Integer> getCot(int i){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int j = 0; j < n; j++){
            ans.add(a[j][i]);
        }
        Collections.sort(ans);
        return ans;
    }
    public void Update(int i){
        ArrayList<Integer> arr = this.getCot(i);
        for(int j = 0; j < n; j++){
            this.a[j][i] = arr.get(j);
        }
    }
    public int[][] getMatrix(){
        return a;
    }
}
public class Bai3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();
            int[] arr = new int[n * m + 5];
            for(int i = 0; i < n * m; i++){
                arr[i] = sc.nextInt();
            }
            Matrix x = new Matrix(n, m, arr);
            x.Update(p - 1);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(x.getMatrix()[i][j] + " ");
                }
                System.out.println();
            }
            
        }
    }
}
