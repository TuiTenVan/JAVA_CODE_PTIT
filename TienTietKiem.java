import java.util.*;

public class TienTietKiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] b = new int[n][2];
        for(int i = 0; i < n; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        Arrays.sort(b, new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                if(x[1] != y[1]){
                    return x[1] - y[1];
                }
                else{
                    return y[0] - x[0];
                }
            }
        });
        long ans = b[0][0];
        long time = b[0][1];
        for(int i = 1; i < n; i++){
            if(time <= t && b[i][1] > time){  
                ans += b[i][0];
                time += b[i][1];
            }
            if(time >= t){
                break;
            }
        }
        System.out.println(ans);
    }   
}