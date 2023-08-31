import java.util.*;

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        int ans = a[0][0] + a[0][1];
        for(int i = 1; i < n; i++){
            if(a[i][0] > ans){
                ans = a[i][0] + a[i][1];
            }
            else{
                ans += a[i][1];
            }
        }
        System.out.println(ans);
    }
}
